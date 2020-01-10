package com.yh.csx.sss.dao.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
/**
 * 
 * @author zhangLong
 * @since 2020-01-09 21:00:52
 */
@Data
@TableName("sss_collect")
public class SssCollectDO {
    /**
     * 主键
     */
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    
    /**
     * 客户编码
     */
    private String customerCode;
    
    /**
     * 客户名称
     */
    private String customerName;
    
    /**
     * 门店编码
     */
    private String shopCode;
    
    /**
     * 门店名称
     */
    private String shopName;
    
    /**
     * 公司代码
     */
    private String companyCode;
    
    /**
     * 公司名称
     */
    private String companyName;
    
    /**
     * 交易金额
     */
    private BigDecimal amount;
    
    /**
     * 交易日期
     */
    private LocalDateTime tradeDate;
    
    /**
     * 本方账号
     */
    private String ourAccount;
    
    /**
     * 本方户名
     */
    private String ourAccountName;
    
    /**
     * 本方银行名称
     */
    private String ourBankName;
    
    /**
     * 对方账号
     */
    private String customerAccount;
    
    /**
     * 对方户名
     */
    private String customerAccountName;
    
    /**
     * 对方银行名称
     */
    private String customerBankName;
    
    /**
     * 认领门店编码
     */
    private String claimsShopCode;
    
    /**
     * 认领门店名称
     */
    private String claimsShopName;
    
    /**
     * 认领人
     */
    private String claimant;
    
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