package com.yh.csx.sss.service.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 客户对账单响应出参
 * @author zhangLong
 * @since 2020-01-09 21:26:54
 */
@Data
@ApiModel("客户对账单响应数据")
public class SssStatementAccountResponse {
    @ApiModelProperty("id")
    private Long id;

    /**
      * 对账单号
      */
    @ApiModelProperty("对账单号")
    private String statementNo;

    /**
      * 客户对账日期
      */
    @ApiModelProperty("客户对账日期")
    private Date customerStatementDate;

    /**
      * 对账金额
      */
    @ApiModelProperty("对账金额")
    private BigDecimal statementAmount;

    /**
      * 客户对账人
      */
    @ApiModelProperty("客户对账人")
    private String customerPerson;

    /**
      * 签约公司编码
      */
    @ApiModelProperty("签约公司编码")
    private String signCompanyCode;

    /**
      * 签约公司名称
      */
    @ApiModelProperty("签约公司名称")
    private String signCompanyName;

    /**
      * 建议开票总金额
      */
    @ApiModelProperty("建议开票总金额")
    private BigDecimal suggestiNvoiceAmount;

    /**
      * 税率0%
      */
    @ApiModelProperty("税率0%")
    private BigDecimal taxAmount00;

    /**
      * 税率9%
      */
    @ApiModelProperty("税率9%")
    private BigDecimal taxAmount09;

    /**
      * 税率13%
      */
    @ApiModelProperty("税率13%")
    private BigDecimal taxAmount13;

    /**
      * 签收单额
      */
    @ApiModelProperty("签收单额")
    private BigDecimal signBillAmount;

    /**
      * 签收单额
      */
    @ApiModelProperty("签收单额")
    private BigDecimal outBillAmount;

    /**
      * 返利额
      */
    @ApiModelProperty("返利额")
    private BigDecimal rebateAmount;

    /**
      * 尾差调整额
      */
    @ApiModelProperty("尾差调整额")
    private BigDecimal tailAdjustmentAmount;

    /**
      * 对账状态
      */
    @ApiModelProperty("对账状态")
    private Integer statementState;

    /**
      * 开票单号
      */
    @ApiModelProperty("开票单号")
    private String invoiceNo;

    /**
      * 创建人
      */
    @ApiModelProperty("创建人")
    private String createBy;

    /**
      * 创建时间
      */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
      * 更新人
      */
    @ApiModelProperty("更新人")
    private String updateBy;

    /**
      * 更新时间
      */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

}