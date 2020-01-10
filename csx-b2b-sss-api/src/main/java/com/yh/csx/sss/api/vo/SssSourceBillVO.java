package com.yh.csx.sss.api.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 客户对账来源单响应VO结果
 *
 * @author zhangLong
 * @since 2020-01-09 21:35:02
 */
@Data
@ApiModel("客户对账来源单响应VO结果")
public class SssSourceBillVO {

    @ApiModelProperty("id")
    private Long id;

    /**
     * 来源单号
     */
    @ApiModelProperty("来源单号")
    private String sourceBillNo;

    /**
     * 子客户编码
     */
    @ApiModelProperty("子客户编码")
    private String childCustomerCode;

    /**
     * 子客户名称
     */
    @ApiModelProperty("子客户名称")
    private String childCustomerName;

    /**
     * 发生时间
     */
    @ApiModelProperty("发生时间")
    private Date happenedDate;

    /**
     * 应付金额
     */
    @ApiModelProperty("应付金额")
    private BigDecimal paymentAmount;

    /**
     * 应收金额
     */
    @ApiModelProperty("应收金额")
    private BigDecimal receivableAmount;

    /**
     * 对账金额
     */
    @ApiModelProperty("对账金额")
    private BigDecimal sourceStatementAmount;

    /**
     * 物流模式 1代表默认无意义
     */
    @ApiModelProperty("物流模式 1代表默认无意义")
    private Integer logisticsPattern;

    /**
     * 是否补单 2代表默认无意义
     */
    @ApiModelProperty("是否补单 2代表默认无意义")
    private Integer whetherRepairBill;

    /**
     * 单据类型
     */
    @ApiModelProperty("单据类型")
    private Integer billType;

    /**
     * 履约地点编码
     */
    @ApiModelProperty("履约地点编码")
    private String appointPlaceCode;

    /**
     * 履约地点名称
     */
    @ApiModelProperty("履约地点名称")
    private String appointPlaceName;

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
     * 对账单号
     */
    @ApiModelProperty("对账单号")
    private String statementNo;

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