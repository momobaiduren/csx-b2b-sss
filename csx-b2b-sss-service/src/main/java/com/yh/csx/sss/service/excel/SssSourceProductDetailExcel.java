package com.yh.csx.sss.service.excel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import com.alibaba.excel.annotation.ExcelProperty;
import com.yh.csx.sss.core.easyexcel.AbstractExcelModel;
import lombok.Data;

/**
 * 来源单据商品详情
 * @author zhangLong
 * @since 2020-01-09 21:25:56
 */

@Data
public class SssSourceProductDetailExcel extends AbstractExcelModel{
    @ExcelProperty("id")
    private Long id;
    
    /**
     *来源单号
     */
    @ExcelProperty("来源单号")
    private String sourceBillNo;
    
    /**
     *发生时间
     */
    @ExcelProperty("发生时间")
    private Date happenedDate;
    
    /**
     *商品编码
     */
    @ExcelProperty("商品编码")
    private String productCode;
    
    /**
     *商品名称
     */
    @ExcelProperty("商品名称")
    private String productName;
    
    /**
     *商品数量
     */
    @ExcelProperty("商品数量")
    private BigDecimal productNum;
    
    /**
     *基础单位
     */
    @ExcelProperty("基础单位")
    private String productUnit;
    
    /**
     *税率
     */
    @ExcelProperty("税率")
    private BigDecimal taxRate;
    
    /**
     *售价
     */
    @ExcelProperty("售价")
    private BigDecimal salePrice;
    
    /**
     *团购价
     */
    @ExcelProperty("团购价")
    private BigDecimal groupBuyingPrice;
    
    /**
     *总金额
     */
    @ExcelProperty("总金额")
    private BigDecimal totalAmount;
    
    /**
     *规格备注
     */
    @ExcelProperty("规格备注")
    private String specificationRemark;
    
    /**
     *加工备注
     */
    @ExcelProperty("加工备注")
    private String processRemark;
    
    /**
     *更新时间
     */
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;
    
    /**
     *创建人
     */
    @ExcelProperty("创建人")
    private String createBy;
    
    /**
     *创建时间
     */
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;
    
    /**
     *更新人
     */
    @ExcelProperty("更新人")
    private String updateBy;
    
}