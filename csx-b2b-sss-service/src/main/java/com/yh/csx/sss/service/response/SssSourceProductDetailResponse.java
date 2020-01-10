package com.yh.csx.sss.service.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 来源单据商品详情响应出参
 * @author zhangLong
 * @since 2020-01-09 21:25:56
 */
@Data
@ApiModel("来源单据商品详情响应数据")
public class SssSourceProductDetailResponse {
    @ApiModelProperty("id")
    private Long id;

    /**
      * 来源单号
      */
    @ApiModelProperty("来源单号")
    private String sourceBillNo;

    /**
      * 发生时间
      */
    @ApiModelProperty("发生时间")
    private Date happenedDate;

    /**
      * 商品编码
      */
    @ApiModelProperty("商品编码")
    private String productCode;

    /**
      * 商品名称
      */
    @ApiModelProperty("商品名称")
    private String productName;

    /**
      * 商品数量
      */
    @ApiModelProperty("商品数量")
    private BigDecimal productNum;

    /**
      * 基础单位
      */
    @ApiModelProperty("基础单位")
    private String productUnit;

    /**
      * 税率
      */
    @ApiModelProperty("税率")
    private BigDecimal taxRate;

    /**
      * 售价
      */
    @ApiModelProperty("售价")
    private BigDecimal salePrice;

    /**
      * 团购价
      */
    @ApiModelProperty("团购价")
    private BigDecimal groupBuyingPrice;

    /**
      * 总金额
      */
    @ApiModelProperty("总金额")
    private BigDecimal totalAmount;

    /**
      * 规格备注
      */
    @ApiModelProperty("规格备注")
    private String specificationRemark;

    /**
      * 加工备注
      */
    @ApiModelProperty("加工备注")
    private String processRemark;

    /**
      * 更新时间
      */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

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

}