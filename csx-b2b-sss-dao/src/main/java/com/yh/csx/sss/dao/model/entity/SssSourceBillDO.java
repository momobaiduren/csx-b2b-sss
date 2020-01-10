package com.yh.csx.sss.dao.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
/**
 * 客户对账来源单
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Data
@TableName("sss_source_bill")
public class SssSourceBillDO {
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    
    /**
     * 来源单号
     */
    private String sourceBillNo;
    
    /**
     * 子客户编码
     */
    private String childCustomerCode;
    
    /**
     * 子客户名称
     */
    private String childCustomerName;
    
    /**
     * 发生时间
     */
    private Date happenedDate;
    
    /**
     * 应付金额

应付金额
     */
    private BigDecimal paymentAmount;
    
    /**
     * 应收金额

应付金额
     */
    private BigDecimal receivableAmount;
    
    /**
     * 对账金额
     */
    private BigDecimal sourceStatementAmount;
    
    /**
     * 物流模式 1代表默认无意义
     */
    private Integer logisticsPattern;
    
    /**
     * 是否补单 2代表默认无意义
     */
    private Integer whetherRepairBill;
    
    /**
     * 单据类型
     */
    private Integer billType;
    
    /**
     * 履约地点编码
     */
    private String appointPlaceCode;
    
    /**
     * 履约地点名称
     */
    private String appointPlaceName;
    
    /**
     * 签约公司编码
     */
    private String signCompanyCode;
    
    /**
     * 签约公司名称
     */
    private String signCompanyName;
    
    /**
     * 对账单号
     */
    private String statementNo;
    
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
    
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    

}