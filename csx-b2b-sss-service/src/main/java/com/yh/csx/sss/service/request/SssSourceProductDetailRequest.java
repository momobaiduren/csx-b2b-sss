package com.yh.csx.sss.service.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import com.yh.csx.sss.dao.model.entity.SssSourceProductDetailDO;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
 * 来源单据商品详情请求入参
 * @author zhangLong
 * @since 2020-01-09 21:25:56
 */
@Data
@ApiModel("来源单据商品详情入参数据")
public class SssSourceProductDetailRequest {
    @NotNull(message = "id不能为空")
    @ApiModelProperty("id")
    private Long id;
        
    /**
      * 来源单号
      */
    @ApiModelProperty("来源单号")
    @NotNull(message = "来源单号不能为空")
    private String sourceBillNo;
        
    /**
      * 发生时间
      */
    @ApiModelProperty("发生时间")
    @NotNull(message = "发生时间不能为空")
    private Date happenedDate;
        
    /**
      * 商品编码
      */
    @ApiModelProperty("商品编码")
    @NotNull(message = "商品编码不能为空")
    private String productCode;
        
    /**
      * 商品名称
      */
    @ApiModelProperty("商品名称")
    @NotNull(message = "商品名称不能为空")
    private String productName;
        
    /**
      * 商品数量
      */
    @ApiModelProperty("商品数量")
    @NotNull(message = "商品数量不能为空")
    private BigDecimal productNum;
        
    /**
      * 基础单位
      */
    @ApiModelProperty("基础单位")
    @NotNull(message = "基础单位不能为空")
    private String productUnit;
        
    /**
      * 税率
      */
    @ApiModelProperty("税率")
    @NotNull(message = "税率不能为空")
    private BigDecimal taxRate;
        
    /**
      * 售价
      */
    @ApiModelProperty("售价")
    @NotNull(message = "售价不能为空")
    private BigDecimal salePrice;
        
    /**
      * 团购价
      */
    @ApiModelProperty("团购价")
    @NotNull(message = "团购价不能为空")
    private BigDecimal groupBuyingPrice;
        
    /**
      * 总金额
      */
    @ApiModelProperty("总金额")
    @NotNull(message = "总金额不能为空")
    private BigDecimal totalAmount;
        
    /**
      * 规格备注
      */
    @ApiModelProperty("规格备注")
    @NotNull(message = "规格备注不能为空")
    private String specificationRemark;
        
    /**
      * 加工备注
      */
    @ApiModelProperty("加工备注")
    @NotNull(message = "加工备注不能为空")
    private String processRemark;
        
    /**
      * 更新时间
      */
    @ApiModelProperty("更新时间")
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updateTime;
        
    /**
      * 创建人
      */
    @ApiModelProperty("创建人")
    @NotNull(message = "创建人不能为空")
    private String createBy;
        
    /**
      * 创建时间
      */
    @ApiModelProperty("创建时间")
    @NotNull(message = "创建时间不能为空")
    private LocalDateTime createTime;
        
    /**
      * 更新人
      */
    @ApiModelProperty("更新人")
    @NotNull(message = "更新人不能为空")
    private String updateBy;
        
    public EntityWrapper<SssSourceProductDetailDO> queryWrapper() {
        EntityWrapper<SssSourceProductDetailDO> ew = new EntityWrapper<>();
            if (Objects.nonNull(id)) {
            ew.eq("id", id);
        }
            if (Objects.nonNull(sourceBillNo)) {
            ew.eq("source_bill_no", sourceBillNo);
        }
            if (Objects.nonNull(happenedDate)) {
            ew.eq("happened_date", happenedDate);
        }
            if (Objects.nonNull(productCode)) {
            ew.eq("product_code", productCode);
        }
            if (Objects.nonNull(productName)) {
            ew.eq("product_name", productName);
        }
            if (Objects.nonNull(productNum)) {
            ew.eq("product_num", productNum);
        }
            if (Objects.nonNull(productUnit)) {
            ew.eq("product_unit", productUnit);
        }
            if (Objects.nonNull(taxRate)) {
            ew.eq("tax_rate", taxRate);
        }
            if (Objects.nonNull(salePrice)) {
            ew.eq("sale_price", salePrice);
        }
            if (Objects.nonNull(groupBuyingPrice)) {
            ew.eq("group_buying_price", groupBuyingPrice);
        }
            if (Objects.nonNull(totalAmount)) {
            ew.eq("total_amount", totalAmount);
        }
            if (Objects.nonNull(specificationRemark)) {
            ew.eq("specification_remark", specificationRemark);
        }
            if (Objects.nonNull(processRemark)) {
            ew.eq("process_remark", processRemark);
        }
            if (Objects.nonNull(updateTime)) {
            ew.eq("update_time", updateTime);
        }
            if (Objects.nonNull(createBy)) {
            ew.eq("create_by", createBy);
        }
            if (Objects.nonNull(createTime)) {
            ew.eq("create_time", createTime);
        }
            if (Objects.nonNull(updateBy)) {
            ew.eq("update_by", updateBy);
        }
            return ew;
    }
    
    /**
     * description 默认是1
     */
    private int current;
    /**
     * description 默认是10
     */
    private int size;

    public Page<SssSourceProductDetailDO> page() {
        return new Page<>(current, size);
    }
    
}