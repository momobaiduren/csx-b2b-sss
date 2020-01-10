package com.yh.csx.sss.core.easyexcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author ZhangLong on 2019/10/16  5:56 下午
 * @version V1.0
 */
public class ExcelData<M extends AbstractExcelModel> {

    public ExcelData() {
        this.sheetsData = new ConcurrentHashMap<>();
    }

    /**
     * description sheet的数据
     */
    private Map<Integer, SheetData<M>> sheetsData;

    /**
     * description 获取全部sheet数据列表
     */
    public Map<Integer, SheetData<M>> getAll() {
        return sheetsData;
    }
    /**
     * description 根据sheet页获取数据
     */
    public List<M> getDataBySheetNum( int sheetNum ) {
        if (Objects.nonNull(sheetsData.get(sheetNum))) {
            return sheetsData.get(sheetNum).getData();
        }
        return null;
    }
    /**
     * description 根据sheet页获取
     */
    public List<M> getErrorDataBySheetNum( int sheetNum ) {
        final SheetData<M> sheetData = sheetsData.get(sheetNum);
        if (Objects.nonNull(sheetData) && sheetData.hasError()) {
            return sheetData.getErrorData();
        }
        return null;
    }
    /**
     * description 获取多个sheet错误信息列表
     */
    public Map<Integer, List<M>> errorSheetsData() {
        final Map<Integer, List<M>> errorDataMap = new HashMap<>();
        sheetsData.forEach((sheetNo, sheetData)->{
            if(sheetData.hasError()) {
                errorDataMap.put(sheetNo, sheetData.getErrorData());
            }
        });
        return errorDataMap;
    }
    /**
     * description 添加model到指定sheet
     */
    public void dataAdd( int sheetNum, M model ) {
        if (sheetsData.containsKey(sheetNum)) {
            sheetsData.get(sheetNum).getData().add(model);
        } else {
            SheetData<M> sheetData = new SheetData<>();
            sheetData.getData().add(model);
            sheetsData.put(sheetNum, sheetData);
        }
    }

    /**
     * create by ZhangLong on 2019/10/16 description 不要数据data/errorData循环中直接使用调用该方法,循环中进行remove可能会导致
     * {@link java.util.ConcurrentModificationException}
     */
    public void errorModelAdd( int sheetNum, M model ) {
        SheetData<M> sheetData = sheetsData.get(sheetNum);
        sheetData.getData().remove(model);
        sheetData.getErrorData().add(model);
    }
    /**
     * description 初始化sheet数据
     */
    public void initSheetData( Integer sheetNo ) {
        sheetsData.put(sheetNo, new SheetData<>());
    }

    @Data
    public static class SheetData<M extends AbstractExcelModel> {

        List<M> data;
        List<M> errorData;

        SheetData() {
            data = new ArrayList<>();
            errorData = new ArrayList<>();
        }
        /**
         * description 当前sheet是否存在错误信息
         */
        public boolean hasError() {
            if (CollectionUtils.isNotEmpty(errorData)) {
                return true;
            }
            return false;
        }
    }
}
