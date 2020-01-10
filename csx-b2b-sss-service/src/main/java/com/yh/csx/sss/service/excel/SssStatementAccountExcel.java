package com.yh.csx.sss.service.excel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import com.alibaba.excel.annotation.ExcelProperty;
import com.yh.csx.sss.core.easyexcel.AbstractExcelModel;
import lombok.Data;

/**
 * 客户对账单
 *
 * @author zhangLong
 * @since 2020-01-09 21:26:54
 */

@Data
public class SssStatementAccountExcel extends AbstractExcelModel {

    @ExcelProperty("id")
    private Long id;

    /**
     * 对账单号
     */
    @ExcelProperty("对账单号")
    private String statementNo;

    /**
     * 客户对账日期
     */
    @ExcelProperty("客户对账日期")
    private Date customerStatementDate;

    /**
     * 对账金额
     */
    @ExcelProperty("对账金额")
    private BigDecimal statementAmount;

    /**
     * 客户对账人
     */
    @ExcelProperty("客户对账人")
    private String customerPerson;

    /**
     * 签约公司编码
     */
    @ExcelProperty("签约公司编码")
    private String signCompanyCode;

    /**
     * 签约公司名称
     */
    @ExcelProperty("签约公司名称")
    private String signCompanyName;

    /**
     * 建议开票总金额
     */
    @ExcelProperty("建议开票总金额")
    private BigDecimal suggestiNvoiceAmount;

    /**
     * 税率0%
     */
    @ExcelProperty("税率0%")
    private BigDecimal taxAmount00;

    /**
     * 税率9%
     */
    @ExcelProperty("税率9%")
    private BigDecimal taxAmount09;

    /**
     * 税率13%
     */
    @ExcelProperty("税率13%")
    private BigDecimal taxAmount13;

    /**
     * 签收单额
     */
    @ExcelProperty("签收单额")
    private BigDecimal signBillAmount;

    /**
     * 签收单额
     */
    @ExcelProperty("签收单额")
    private BigDecimal outBillAmount;

    /**
     * 返利额
     */
    @ExcelProperty("返利额")
    private BigDecimal rebateAmount;

    /**
     * 尾差调整额
     */
    @ExcelProperty("尾差调整额")
    private BigDecimal tailAdjustmentAmount;

    /**
     * 对账状态
     */
    @ExcelProperty("对账状态")
    private Integer statementState;

    /**
     * 开票单号
     */
    @ExcelProperty("开票单号")
    private String invoiceNo;

    /**
     * 创建人
     */
    @ExcelProperty("创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @ExcelProperty("更新人")
    private String updateBy;

    /**
     * 更新时间
     */
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

}