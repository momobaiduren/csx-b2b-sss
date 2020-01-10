package com.yh.csx.sss.service.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import com.yh.csx.sss.dao.model.entity.SssCollectDO;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
 * 请求入参
 * @author zhangLong
 * @since 2020-01-09 21:06:20
 */
@Data
@ApiModel("入参数据")
public class SssCollectRequest {
    /**
      * 主键
      */
    @ApiModelProperty("主键")
    @NotNull(message = "主键不能为空")
    private Long id;
        
    /**
      * 客户编码
      */
    @ApiModelProperty("客户编码")
    @NotNull(message = "客户编码不能为空")
    private String customerCode;
        
    /**
      * 客户名称
      */
    @ApiModelProperty("客户名称")
    @NotNull(message = "客户名称不能为空")
    private String customerName;
        
    /**
      * 门店编码
      */
    @ApiModelProperty("门店编码")
    @NotNull(message = "门店编码不能为空")
    private String shopCode;
        
    /**
      * 门店名称
      */
    @ApiModelProperty("门店名称")
    @NotNull(message = "门店名称不能为空")
    private String shopName;
        
    /**
      * 公司代码
      */
    @ApiModelProperty("公司代码")
    @NotNull(message = "公司代码不能为空")
    private String companyCode;
        
    /**
      * 公司名称
      */
    @ApiModelProperty("公司名称")
    @NotNull(message = "公司名称不能为空")
    private String companyName;
        
    /**
      * 交易金额
      */
    @ApiModelProperty("交易金额")
    @NotNull(message = "交易金额不能为空")
    private BigDecimal amount;
        
    /**
      * 交易日期
      */
    @ApiModelProperty("交易日期")
    @NotNull(message = "交易日期不能为空")
    private LocalDateTime tradeDate;
        
    /**
      * 本方账号
      */
    @ApiModelProperty("本方账号")
    @NotNull(message = "本方账号不能为空")
    private String ourAccount;
        
    /**
      * 本方户名
      */
    @ApiModelProperty("本方户名")
    @NotNull(message = "本方户名不能为空")
    private String ourAccountName;
        
    /**
      * 本方银行名称
      */
    @ApiModelProperty("本方银行名称")
    @NotNull(message = "本方银行名称不能为空")
    private String ourBankName;
        
    /**
      * 对方账号
      */
    @ApiModelProperty("对方账号")
    @NotNull(message = "对方账号不能为空")
    private String customerAccount;
        
    /**
      * 对方户名
      */
    @ApiModelProperty("对方户名")
    @NotNull(message = "对方户名不能为空")
    private String customerAccountName;
        
    /**
      * 对方银行名称
      */
    @ApiModelProperty("对方银行名称")
    @NotNull(message = "对方银行名称不能为空")
    private String customerBankName;
        
    /**
      * 认领门店编码
      */
    @ApiModelProperty("认领门店编码")
    @NotNull(message = "认领门店编码不能为空")
    private String claimsShopCode;
        
    /**
      * 认领门店名称
      */
    @ApiModelProperty("认领门店名称")
    @NotNull(message = "认领门店名称不能为空")
    private String claimsShopName;
        
    /**
      * 认领人
      */
    @ApiModelProperty("认领人")
    @NotNull(message = "认领人不能为空")
    private String claimant;
        
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
        
    /**
      * 更新时间
      */
    @ApiModelProperty("更新时间")
    @NotNull(message = "更新时间不能为空")
    private LocalDateTime updateTime;
        
    public EntityWrapper<SssCollectDO> queryWrapper() {
        EntityWrapper<SssCollectDO> ew = new EntityWrapper<>();
            if (Objects.nonNull(id)) {
            ew.eq("id", id);
        }
            if (Objects.nonNull(customerCode)) {
            ew.eq("customer_code", customerCode);
        }
            if (Objects.nonNull(customerName)) {
            ew.eq("customer_name", customerName);
        }
            if (Objects.nonNull(shopCode)) {
            ew.eq("shop_code", shopCode);
        }
            if (Objects.nonNull(shopName)) {
            ew.eq("shop_name", shopName);
        }
            if (Objects.nonNull(companyCode)) {
            ew.eq("company_code", companyCode);
        }
            if (Objects.nonNull(companyName)) {
            ew.eq("company_name", companyName);
        }
            if (Objects.nonNull(amount)) {
            ew.eq("amount", amount);
        }
            if (Objects.nonNull(tradeDate)) {
            ew.eq("trade_date", tradeDate);
        }
            if (Objects.nonNull(ourAccount)) {
            ew.eq("our_account", ourAccount);
        }
            if (Objects.nonNull(ourAccountName)) {
            ew.eq("our_account_name", ourAccountName);
        }
            if (Objects.nonNull(ourBankName)) {
            ew.eq("our_bank_name", ourBankName);
        }
            if (Objects.nonNull(customerAccount)) {
            ew.eq("customer_account", customerAccount);
        }
            if (Objects.nonNull(customerAccountName)) {
            ew.eq("customer_account_name", customerAccountName);
        }
            if (Objects.nonNull(customerBankName)) {
            ew.eq("customer_bank_name", customerBankName);
        }
            if (Objects.nonNull(claimsShopCode)) {
            ew.eq("claims_shop_code", claimsShopCode);
        }
            if (Objects.nonNull(claimsShopName)) {
            ew.eq("claims_shop_name", claimsShopName);
        }
            if (Objects.nonNull(claimant)) {
            ew.eq("claimant", claimant);
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
            if (Objects.nonNull(updateTime)) {
            ew.eq("update_time", updateTime);
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

    public Page<SssCollectDO> page() {
        return new Page<>(current, size);
    }
    
}