package com.yh.csx.sss.dao.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
/**
 * 发票表
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Data
@TableName("sss_invoice")
public class SssInvoiceDO {
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    
    /**
     * 公司代码
     */
    private String companyCode;
    
    /**
     * 公司名称
     */
    private String companyName;
    
    /**
     * 客户编码
     */
    private String customerCode;
    
    /**
     * 客户名称
     */
    private String customerName;
    
    /**
     * 发票种类
     */
    private Integer invoiceType;
    
    /**
     * 发票代码


     */
    private String invoiceCode;
    
    /**
     * 发票号码
     */
    private String invoiceNo;
    
    /**
     * 购方税号
     */
    private String taxNo;
    
    /**
     * 购方地址
     */
    private String address;
    
    /**
     * 购方电话
     */
    private String telephone;
    
    /**
     * 购方银行卡号
     */
    private String cardNumber;
    
    /**
     * 开票人
     */
    private String drawer;
    
    /**
     * 开票日期
     */
    private LocalDateTime makeOutDate;
    
    /**
     * 报送状态
     */
    private Integer sendStatus;
    
    /**
     * 所属月份
     */
    private String belongMonths;
    
    /**
     * 合计金额
     */
    private BigDecimal totalAmount;
    
    /**
     * 税率
     */
    private BigDecimal taxRate;
    
    /**
     * 合计税额
     */
    private BigDecimal totalTaxAmount;
    
    /**
     * 商品名称
     */
    private String goodsName;
    
    /**
     * 商品税目
     */
    private String goodsTaxItem;
    
    /**
     * 签收人
     */
    private String signer;
    
    /**
     * 签收日期
     */
    private LocalDateTime signDate;
    
    /**
     * 备注
     */
    private String remark;
    
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