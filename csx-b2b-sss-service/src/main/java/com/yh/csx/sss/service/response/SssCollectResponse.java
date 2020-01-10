package com.yh.csx.sss.service.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 响应出参
 * @author zhangLong
 * @since 2020-01-09 21:06:21
 */
@Data
@ApiModel("响应数据")
public class SssCollectResponse {
    /**
      * 主键
      */
    @ApiModelProperty("主键")
    private Long id;

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
      * 门店编码
      */
    @ApiModelProperty("门店编码")
    private String shopCode;

    /**
      * 门店名称
      */
    @ApiModelProperty("门店名称")
    private String shopName;

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
      * 交易金额
      */
    @ApiModelProperty("交易金额")
    private BigDecimal amount;

    /**
      * 交易日期
      */
    @ApiModelProperty("交易日期")
    private LocalDateTime tradeDate;

    /**
      * 本方账号
      */
    @ApiModelProperty("本方账号")
    private String ourAccount;

    /**
      * 本方户名
      */
    @ApiModelProperty("本方户名")
    private String ourAccountName;

    /**
      * 本方银行名称
      */
    @ApiModelProperty("本方银行名称")
    private String ourBankName;

    /**
      * 对方账号
      */
    @ApiModelProperty("对方账号")
    private String customerAccount;

    /**
      * 对方户名
      */
    @ApiModelProperty("对方户名")
    private String customerAccountName;

    /**
      * 对方银行名称
      */
    @ApiModelProperty("对方银行名称")
    private String customerBankName;

    /**
      * 认领门店编码
      */
    @ApiModelProperty("认领门店编码")
    private String claimsShopCode;

    /**
      * 认领门店名称
      */
    @ApiModelProperty("认领门店名称")
    private String claimsShopName;

    /**
      * 认领人
      */
    @ApiModelProperty("认领人")
    private String claimant;

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