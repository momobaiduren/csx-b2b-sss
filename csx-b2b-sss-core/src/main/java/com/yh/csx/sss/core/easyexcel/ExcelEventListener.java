package com.yh.csx.sss.core.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.exception.ExcelDataConvertException;
import com.yh.csx.sss.core.validation.ValidationManager;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhanglong
 * @describ 事件解析监听处理器
 * @date 2019-06-01  13:09
 */
@Slf4j
@Data
public class ExcelEventListener<M extends AbstractExcelModel> extends AnalysisEventListener<M> {

    private ExcelData<M> excelData;


    ExcelEventListener( ExcelData<M> excelData) {
        this.excelData = excelData;
    }


    @Override
    public void invoke( M model, AnalysisContext analysisContext ) {
        //检查每一个需要校验的数据
        ValidationManager
            .validation(null).validateEntity(model)
            .consumer(validationEntityResult -> {
                Integer sheetNo = analysisContext.readSheetHolder().getSheetNo();
                if (!validationEntityResult.hasError()) {
                    excelData.dataAdd(sheetNo, model);
                } else {
                    model.setErrorMsg(
                        String.format("检查错误：%s", validationEntityResult.errorMsg()));
                    excelData.errorModelAdd(sheetNo, model);
                }
            });

    }

    @Override
    public void onException( Exception exception, AnalysisContext context ) {
        log.error("解析失败，但是继续解析下一行:{}", exception.getMessage());
        // 如果是某一个单元格的转换异常 能获取到具体行号
        // 如果要获取头的信息 配合invokeHeadMap使用
        if (exception instanceof ExcelDataConvertException) {
            ExcelDataConvertException excelDataConvertException = (ExcelDataConvertException) exception;
            log.error("第{}行，第{}列解析异常，数据为:{}", excelDataConvertException.getRowIndex(),
                excelDataConvertException.getColumnIndex(),
                excelDataConvertException.getCellData());
        }
    }

    @Override
    public void doAfterAllAnalysed( AnalysisContext analysisContext ) {
//        if (Objects.nonNull(consumer)) {
//            consumer.accept(excelData);
//        }
        excelData.getAll().forEach((sheetNo, sheetData)->{

        });
    }

}
