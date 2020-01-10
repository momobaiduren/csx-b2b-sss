package com.yh.csx.sss.core.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.bsf.core.util.WebUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 * create by ZhangLong on 2019-08-31
 *
 * @description: 执行器 直接调用方法 默认使用 javax.validation 默认校验器， 在实体类上添加 java.validation注解例如@NotNull(message
 * = "xxx不能为空")
 */
@Slf4j
public final class EasyExcelExecutor {

    private static final String ERROR_PREFIX = "error_";

    private EasyExcelExecutor() {
    }

    /**
     * create by ZhangLong on 2019-08-31
     */
    public static <M extends AbstractExcelModel> ExcelDataConsumer<M> importExcel(
        final MultipartFile file,
        final Class<M> clazz ) {
        final List<ImportSheetDetail<M>> importSheetDetails = new ArrayList<>();
        ImportSheetDetail<M> importSheetDetail = new ImportSheetDetail<>();
        importSheetDetail.setMClass(clazz);
        importSheetDetail.setSheetNo(0);
        importSheetDetails.add(importSheetDetail);
        return importMoreExcel(file, importSheetDetails);
    }

    private static <M extends AbstractExcelModel> ExcelDataConsumer<M> importMoreExcel(
        MultipartFile file,
        List<ImportSheetDetail<M>> importSheetDetails ) {
        return importMoreExcelAndExportErrorData(file, false, importSheetDetails);
    }

    public static <M extends AbstractExcelModel> ExcelDataConsumer<M> importExcelAndExportErrorData(
        final MultipartFile file, final Class<M> clazz ) {
        final List<ImportSheetDetail<M>> importSheetDetails = new ArrayList<>();
        ImportSheetDetail<M> importSheetDetail = new ImportSheetDetail<>();
        importSheetDetail.setMClass(clazz);
        importSheetDetail.validatedAndInit();
        importSheetDetails.add(importSheetDetail);
        return importMoreExcelAndExportErrorData(file, true, importSheetDetails);
    }

    /**
     * create by ZhangLong on 2019-08-31
     *
     * @param file 导入数据的消费处理 并且excelData非空
     * @param importSheetDetails 不为null实现导出处理 description 导入
     */
    public static <M extends AbstractExcelModel> ExcelDataConsumer<M> importMoreExcelAndExportErrorData(
        final MultipartFile file, boolean isErrorMsgResponse,
        final List<ImportSheetDetail<M>> importSheetDetails ) {
        Objects.requireNonNull(file, "导入文件不能为空");
        Objects.requireNonNull(importSheetDetails, "导入输入信息不能为空");
        ExcelData<M> excelData = new ExcelData<>();
        try (InputStream inputStream = file.getInputStream()) {
            ExcelReader excelReader = EasyExcel.read(inputStream).build();
            List<ExportSheetDetail<M, M>> errorSheetDetails = new ArrayList<>();
            List<ReadSheet> readSheets = new ArrayList<>(importSheetDetails.size());
            for (ImportSheetDetail<M> importSheetDetail : importSheetDetails) {
                // 这里可以接入多线程 errorSheetDetails/readSheets是线程不安全的需要处理下
                dealWithSheet(isErrorMsgResponse, excelData, readSheets, importSheetDetail,
                    errorSheetDetails);
            }
            excelReader.read(readSheets.toArray(new ReadSheet[importSheetDetails.size()]));
            excelReader.finish();
            if (isErrorMsgResponse) {
                final String fileName = Objects.requireNonNull(file.getOriginalFilename());
                exportMoreSheet(ERROR_PREFIX + fileName.substring(0, fileName.lastIndexOf(".")),
                    errorSheetDetails);

            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return new ExcelDataConsumer<>(excelData);
    }

    private static <M extends AbstractExcelModel> void dealWithSheet( boolean isErrorMsgResponse,
        ExcelData<M> excelData, List<ReadSheet> readSheets, ImportSheetDetail<M> importSheetDetail,
        List<ExportSheetDetail<M, M>> errorSheetDetails ) {
        importSheetDetail.validatedAndInit();
        Integer sheetNo = importSheetDetail.getSheetNo();
        excelData.initSheetData(sheetNo);
        ReadSheet readSheet = EasyExcel.readSheet(sheetNo)
            .headRowNumber(importSheetDetail.getHeadRowNumber())
            .head(importSheetDetail.getMClass())
            .registerReadListener(new ExcelEventListener<>(excelData)).build();
        readSheets.add(readSheet);
        if (isErrorMsgResponse) {
            final ExportSheetDetail<M, M> exportSheetDetail = new ExportSheetDetail<>();
            exportSheetDetail.setSheetNo(importSheetDetail.getSheetNo());
            exportSheetDetail.setMClass(importSheetDetail.getMClass());
            exportSheetDetail
                .setData(excelData.getErrorDataBySheetNum(importSheetDetail.getSheetNo()));
            exportSheetDetail.setHeadRowNumber(importSheetDetail.getHeadRowNumber());
            exportSheetDetail.setSheetName(importSheetDetail.getSheetName());
            errorSheetDetails.add(exportSheetDetail);
        }
    }

    public static <M extends AbstractExcelModel, S> void exportMoreSheet( String fileName,
        List<ExportSheetDetail<M, S>> sheetDetails ) {
        Objects.requireNonNull(sheetDetails, "导出信息不能为空");
        HttpServletResponse response = Objects.requireNonNull(WebUtils.getResponse());
        checkResponse(fileName, response);
        try (OutputStream outputStream = response.getOutputStream()) {
            ExcelWriter excelWriter = EasyExcel.write(outputStream).build();
            for (ExportSheetDetail<M, S> sheetDetail : sheetDetails) {
                WriteSheet writeSheet = EasyExcel
                    .writerSheet(sheetDetail.getSheetNo(), sheetDetail.getSheetName()).head(sheetDetail.getMClass()).build();
                final List<M> exportModels = Mapper
                    .map(sheetDetail.getData(), sheetDetail.getMClass());
                excelWriter.write(exportModels, writeSheet);
            }
            excelWriter.finish();
            outputStream.flush();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


    private static void checkResponse( String fileName, HttpServletResponse response ) {
        if (Objects.isNull(response)) {
            throw new RuntimeException("未绑定响应{@HttpServletResponse}参数");
        }
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileNameEncoded = null;
        try {
            fileNameEncoded = URLEncoder
                .encode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            log.error("导出文件名编码异常：", e);
        }
        response.setHeader("Content-disposition",
            "attachment;filename=" + fileNameEncoded + ExcelTypeEnum.XLSX.getValue());
    }

    /**
     * create by ZhangLong on 2019/10/21 description 导出到服务本地指定文件目录下
     */
    @SuppressWarnings("all")
    public static <M extends AbstractExcelModel> void exportResponse( Class<M> clazz,
        File excleFile,
        String sheetName,
        List<M> dataList ) {
        Objects.requireNonNull(excleFile, "dataListFunction could not be null");
        if (excleFile.exists()) {
            try (OutputStream outputStream = new FileOutputStream(excleFile)) {
                //新版本方法
                if (CollectionUtils.isNotEmpty(dataList)) {
                    EasyExcel.write(outputStream, clazz).sheet(0).doWrite(dataList);

                }
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        } else {
            try {
                excleFile.createNewFile();
                exportResponse(clazz, excleFile, sheetName, dataList);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }

    /**
     * created by zhanglong and since  2019/11/27 10:23 上午
     * 默认导出第一sheet 标题行为第一行
     */
    public static <M extends AbstractExcelModel, S> void exportResponse( Class<M> mClass,
        String fileName,
        String sheetName, List<S> dataList ) {
        ExportSheetDetail<M, S> excelModelExportSheetDetail = new ExportSheetDetail<>(mClass,
            dataList, sheetName, 1, 0);
        List<ExportSheetDetail<M, S>> exportSheetDetails = new ArrayList<>();
        exportSheetDetails.add(excelModelExportSheetDetail);
        exportMoreSheet(fileName, exportSheetDetails);

    }

    public static <M extends AbstractExcelModel, S> void export( Class<M> mClass,
        String fileName,
        String sheetName, List<S> dataList ) throws IOException {
        final HttpServletResponse response = WebUtils.getResponse();
        checkResponse(fileName, response);
        final ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream())
            .build();
        WriteSheet writeSheet = EasyExcel.writerSheet(0, sheetName).head(mClass).build();
        excelWriter.write(dataList, writeSheet);
        excelWriter.write(dataList, writeSheet);
        excelWriter.finish();

    }



    public static class ExcelDataConsumer<M extends AbstractExcelModel> {

        private ExcelData<M> excelData;

        public ExcelDataConsumer( ExcelData<M> excelData ) {
            this.excelData = excelData;
        }

        /**
         * description 消费导入结果
         */
        public void consumer( Consumer<ExcelData<M>> consumer ) {
            consumer.accept(excelData);
        }
    }
}
