package com.yh.csx.sss.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 客户对账来源单请求入参
 *
 * @author zhangLong
 * @since 2020-01-09 21:35:02
 */
@Data
@ApiModel("客户对账来源单入参数据")
public class SssSourceBillRpcReq {

    @ApiModelProperty("id")
    @NotNull(message = " 不能为空")
    private Long id;

    /**
     * 来源单号
     */
    @ApiModelProperty("来源单号")
    @NotNull(message = "来源单号 不能为空")
    private String sourceBillNo;

    /**
     * 子客户编码
     */
    @ApiModelProperty("子客户编码")
    @NotNull(message = "子客户编码 不能为空")
    private String childCustomerCode;

    /**
     * 子客户名称
     */
    @ApiModelProperty("子客户名称")
    @NotNull(message = "子客户名称 不能为空")
    private String childCustomerName;

    /**
     * 发生时间
     */
    @ApiModelProperty("发生时间")
    @NotNull(message = "发生时间 不能为空")
    private Date happenedDate;

    /**
     * 应付金额
     */
    @ApiModelProperty("应付金额")
    @NotNull(message = "应付金额不能为空")
    private BigDecimal paymentAmount;

    /**
     * 应收金额
     */
    @ApiModelProperty("应收金额")
    @NotNull(message = "应收金额不能为空")
    private BigDecimal receivableAmount;

    /**
     * 对账金额
     */
    @ApiModelProperty("对账金额")
    @NotNull(message = "对账金额 不能为空")
    private BigDecimal sourceStatementAmount;

    /**
     * 物流模式 1代表默认无意义
     */
    @ApiModelProperty("物流模式 1代表默认无意义")
    @NotNull(message = "物流模式 1代表默认无意义 不能为空")
    private Integer logisticsPattern;

    /**
     * 是否补单 2代表默认无意义
     */
    @ApiModelProperty("是否补单 2代表默认无意义")
    @NotNull(message = "是否补单 2代表默认无意义 不能为空")
    private Integer whetherRepairBill;

    /**
     * 单据类型
     */
    @ApiModelProperty("单据类型")
    @NotNull(message = "单据类型 不能为空")
    private Integer billType;

    /**
     * 履约地点编码
     */
    @ApiModelProperty("履约地点编码")
    @NotNull(message = "履约地点编码 不能为空")
    private String appointPlaceCode;

    /**
     * 履约地点名称
     */
    @ApiModelProperty("履约地点名称")
    @NotNull(message = "履约地点名称 不能为空")
    private String appointPlaceName;

    /**
     * 签约公司编码
     */
    @ApiModelProperty("签约公司编码")
    @NotNull(message = "签约公司编码 不能为空")
    private String signCompanyCode;

    /**
     * 签约公司名称
     */
    @ApiModelProperty("签约公司名称")
    @NotNull(message = "签约公司名称 不能为空")
    private String signCompanyName;

    /**
     * 对账单号
     */
    @ApiModelProperty("对账单号")
    @NotNull(message = "对账单号 不能为空")
    private String statementNo;

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
    private LocalDateTime createTime;

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
    private LocalDateTime updateTime;

    /**
     * description 默认是1
     */
    private int current;
    /**
     * description 默认是10
     */
    private int size;
}