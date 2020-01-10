package com.yh.csx.sss.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 请求入参
 *
 * @author zhangLong
 * @since 2020-01-09 21:33:45
 */
@Data
@ApiModel("入参数据")
public class SssCollectRpcReq {

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    @NotNull(message = "主键 不能为空")
    private Long id;

    /**
     * 客户编码
     */
    @ApiModelProperty("客户编码")
    @NotNull(message = "客户编码 不能为空")
    private String customerCode;

    /**
     * 客户名称
     */
    @ApiModelProperty("客户名称")
    @NotNull(message = "客户名称 不能为空")
    private String customerName;

    /**
     * 门店编码
     */
    @ApiModelProperty("门店编码")
    @NotNull(message = "门店编码 不能为空")
    private String shopCode;

    /**
     * 门店名称
     */
    @ApiModelProperty("门店名称")
    @NotNull(message = "门店名称 不能为空")
    private String shopName;

    /**
     * 公司代码
     */
    @ApiModelProperty("公司代码")
    @NotNull(message = "公司代码 不能为空")
    private String companyCode;

    /**
     * 公司名称
     */
    @ApiModelProperty("公司名称")
    @NotNull(message = "公司名称 不能为空")
    private String companyName;

    /**
     * 交易金额
     */
    @ApiModelProperty("交易金额")
    @NotNull(message = "交易金额 不能为空")
    private BigDecimal amount;

    /**
     * 交易日期
     */
    @ApiModelProperty("交易日期")
    @NotNull(message = "交易日期 不能为空")
    private Date tradeDate;

    /**
     * 本方账号
     */
    @ApiModelProperty("本方账号")
    @NotNull(message = "本方账号 不能为空")
    private String ourAccount;

    /**
     * 本方户名
     */
    @ApiModelProperty("本方户名")
    @NotNull(message = "本方户名 不能为空")
    private String ourAccountName;

    /**
     * 本方银行名称
     */
    @ApiModelProperty("本方银行名称")
    @NotNull(message = "本方银行名称 不能为空")
    private String ourBankName;

    /**
     * 对方账号
     */
    @ApiModelProperty("对方账号")
    @NotNull(message = "对方账号 不能为空")
    private String customerAccount;

    /**
     * 对方户名
     */
    @ApiModelProperty("对方户名")
    @NotNull(message = "对方户名 不能为空")
    private String customerAccountName;

    /**
     * 对方银行名称
     */
    @ApiModelProperty("对方银行名称")
    @NotNull(message = "对方银行名称 不能为空")
    private String customerBankName;

    /**
     * 认领门店编码
     */
    @ApiModelProperty("认领门店编码")
    @NotNull(message = "认领门店编码 不能为空")
    private String claimsShopCode;

    /**
     * 认领门店名称
     */
    @ApiModelProperty("认领门店名称")
    @NotNull(message = "认领门店名称 不能为空")
    private String claimsShopName;

    /**
     * 认领人
     */
    @ApiModelProperty("认领人")
    @NotNull(message = "认领人 不能为空")
    private String claimant;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    @NotNull(message = "创建人 不能为空")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @NotNull(message = "创建时间 不能为空")
    private Date createTime;

    /**
     * 更新人
     */
    @ApiModelProperty("更新人")
    @NotNull(message = "更新人 不能为空")
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @NotNull(message = "更新时间 不能为空")
    private Date updateTime;


    /**
     * description 默认是1
     */
    private int current;
    /**
     * description 默认是10
     */
    private int size;

}