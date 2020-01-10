package com.yh.csx.sss.dao.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
/**
 * 来源单据商品详情
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Data
@TableName("sss_source_product_detail")
public class SssSourceProductDetailDO {
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    
    /**
     * 来源单号
     */
    private String sourceBillNo;
    
    /**
     * 发生时间
     */
    private Date happenedDate;
    
    /**
     * 商品编码
     */
    private String productCode;
    
    /**
     * 商品名称
     */
    private String productName;
    
    /**
     * 商品数量
     */
    private BigDecimal productNum;
    
    /**
     * 基础单位
     */
    private String productUnit;
    
    /**
     * 税率
     */
    private BigDecimal taxRate;
    
    /**
     * 售价
     */
    private BigDecimal salePrice;
    
    /**
     * 团购价
     */
    private BigDecimal groupBuyingPrice;
    
    /**
     * 总金额
     */
    private BigDecimal totalAmount;
    
    /**
     * 规格备注
     */
    private String specificationRemark;
    
    /**
     * 加工备注
     */
    private String processRemark;
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    
    /**
     * 创建人
     */
    private String createBy;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    
    /**
     * 更新人
     */
    private String updateBy;
    

}