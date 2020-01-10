package com.yh.csx.sss.service.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 发票表响应出参
 * @author zhangLong
 * @since 2020-01-09 21:23:30
 */
@Data
@ApiModel("发票表响应数据")
public class SssInvoiceResponse {
    @ApiModelProperty("id")
    private Long id;

    /**
      * 公司代码
      */
    @ApiModelProperty("公司代码")
    private String companyCode;

    /**
      * 公司名称
      */
    @ApiModelProperty("公司名称")
    private String companyName;

    /**
      * 客户编码
      */
    @ApiModelProperty("客户编码")
    private String customerCode;

    /**
      * 客户名称
      */
    @ApiModelProperty("客户名称")
    private String customerName;

    /**
      * 发票种类
      */
    @ApiModelProperty("发票种类")
    private Integer invoiceType;

    /**
      * 发票代码


      */
    @ApiModelProperty("发票代码")
    private String invoiceCode;

    /**
      * 发票号码
      */
    @ApiModelProperty("发票号码")
    private String invoiceNo;

    /**
      * 购方税号
      */
    @ApiModelProperty("购方税号")
    private String taxNo;

    /**
      * 购方地址
      */
    @ApiModelProperty("购方地址")
    private String address;

    /**
      * 购方电话
      */
    @ApiModelProperty("购方电话")
    private String telephone;

    /**
      * 购方银行卡号
      */
    @ApiModelProperty("购方银行卡号")
    private String cardNumber;

    /**
      * 开票人
      */
    @ApiModelProperty("开票人")
    private String drawer;

    /**
      * 开票日期
      */
    @ApiModelProperty("开票日期")
    private LocalDateTime makeOutDate;

    /**
      * 报送状态
      */
    @ApiModelProperty("报送状态")
    private Integer sendStatus;

    /**
      * 所属月份
      */
    @ApiModelProperty("所属月份")
    private String belongMonths;

    /**
      * 合计金额
      */
    @ApiModelProperty("合计金额")
    private BigDecimal totalAmount;

    /**
      * 税率
      */
    @ApiModelProperty("税率")
    private BigDecimal taxRate;

    /**
      * 合计税额
      */
    @ApiModelProperty("合计税额")
    private BigDecimal totalTaxAmount;

    /**
      * 商品名称
      */
    @ApiModelProperty("商品名称")
    private String goodsName;

    /**
      * 商品税目
      */
    @ApiModelProperty("商品税目")
    private String goodsTaxItem;

    /**
      * 签收人
      */
    @ApiModelProperty("签收人")
    private String signer;

    /**
      * 签收日期
      */
    @ApiModelProperty("签收日期")
    private LocalDateTime signDate;

    /**
      * 备注
      */
    @ApiModelProperty("备注")
    private String remark;

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