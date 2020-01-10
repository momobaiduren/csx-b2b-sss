package com.yh.csx.sss.service.excel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import com.alibaba.excel.annotation.ExcelProperty;
import com.yh.csx.sss.core.easyexcel.AbstractExcelModel;
import lombok.Data;

/**
 * 
 * @author zhangLong
 * @since 2020-01-09 21:06:22
 */

@Data
public class SssCollectExcel extends AbstractExcelModel{
    /**
     *主键
     */
    @ExcelProperty("主键")
    private Long id;
    
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
     *门店编码
     */
    @ExcelProperty("门店编码")
    private String shopCode;
    
    /**
     *门店名称
     */
    @ExcelProperty("门店名称")
    private String shopName;
    
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
     *交易金额
     */
    @ExcelProperty("交易金额")
    private BigDecimal amount;
    
    /**
     *交易日期
     */
    @ExcelProperty("交易日期")
    private LocalDateTime tradeDate;
    
    /**
     *本方账号
     */
    @ExcelProperty("本方账号")
    private String ourAccount;
    
    /**
     *本方户名
     */
    @ExcelProperty("本方户名")
    private String ourAccountName;
    
    /**
     *本方银行名称
     */
    @ExcelProperty("本方银行名称")
    private String ourBankName;
    
    /**
     *对方账号
     */
    @ExcelProperty("对方账号")
    private String customerAccount;
    
    /**
     *对方户名
     */
    @ExcelProperty("对方户名")
    private String customerAccountName;
    
    /**
     *对方银行名称
     */
    @ExcelProperty("对方银行名称 ")
    private String customerBankName;
    
    /**
     *认领门店编码
     */
    @ExcelProperty("认领门店编码")
    private String claimsShopCode;
    
    /**
     *认领门店名称
     */
    @ExcelProperty("认领门店名称")
    private String claimsShopName;
    
    /**
     *认领人
     */
    @ExcelProperty("认领人")
    private String claimant;
    
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