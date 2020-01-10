package com.yh.csx.sss.service.excel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.ExcelProperty;
import com.yh.csx.sss.core.easyexcel.AbstractExcelModel;
import lombok.Data;

/**
 * 发票表
 * @author zhangLong
 * @since 2020-01-09 21:23:30
 */

@Data
public class SssInvoiceExcel extends AbstractExcelModel{
    @ExcelProperty("id")
    private Long id;
    
    /**
     *公司代码
     */
    @ExcelProperty("公司代码")
    private String companyCode;
    
    /**
     *公司名称
     */
    @ExcelProperty("公司名称")
    private String companyName;
    
    /**
     *客户编码
     */
    @ExcelProperty("客户编码")
    private String customerCode;
    
    /**
     *客户名称
     */
    @ExcelProperty("客户名称")
    private String customerName;
    
    /**
     *发票种类
     */
    @ExcelProperty("发票种类")
    private Integer invoiceType;
    
    /**
     *发票代码


     */
    @ExcelProperty("发票代码")
    private String invoiceCode;
    
    /**
     *发票号码
     */
    @ExcelProperty("发票号码")
    private String invoiceNo;
    
    /**
     *购方税号
     */
    @ExcelProperty("购方税号")
    private String taxNo;
    
    /**
     *购方地址
     */
    @ExcelProperty("购方地址")
    private String address;
    
    /**
     *购方电话
     */
    @ExcelProperty("购方电话")
    private String telephone;
    
    /**
     *购方银行卡号
     */
    @ExcelProperty("购方银行卡号")
    private String cardNumber;
    
    /**
     *开票人
     */
    @ExcelProperty("开票人")
    private String drawer;
    
    /**
     *开票日期
     */
    @ExcelProperty("开票日期")
    private LocalDateTime makeOutDate;
    
    /**
     *报送状态
     */
    @ExcelProperty("报送状态")
    private Integer sendStatus;
    
    /**
     *所属月份
     */
    @ExcelProperty("所属月份")
    private String belongMonths;
    
    /**
     *合计金额
     */
    @ExcelProperty("合计金额")
    private BigDecimal totalAmount;
    
    /**
     *税率
     */
    @ExcelProperty("税率")
    private BigDecimal taxRate;
    
    /**
     *合计税额
     */
    @ExcelProperty("合计税额")
    private BigDecimal totalTaxAmount;
    
    /**
     *商品名称
     */
    @ExcelProperty("商品名称")
    private String goodsName;
    
    /**
     *商品税目
     */
    @ExcelProperty("商品税目")
    private String goodsTaxItem;
    
    /**
     *签收人
     */
    @ExcelProperty("签收人")
    private String signer;
    
    /**
     *签收日期
     */
    @ExcelProperty("签收日期")
    private LocalDateTime signDate;
    
    /**
     *备注
     */
    @ExcelProperty("备注")
    private String remark;
    
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
    
    /**
     *更新时间
     */
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;
    
}