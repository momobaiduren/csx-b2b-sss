package com.yh.csx.sss.service.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import com.yh.csx.sss.dao.model.entity.SssSourceBillDO;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
 * 客户对账来源单请求入参
 * @author zhangLong
 * @since 2020-01-09 21:25:30
 */
@Data
@ApiModel("客户对账来源单入参数据")
public class SssSourceBillRequest {
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
      * 子客户编码
      */
    @ApiModelProperty("子客户编码")
    @NotNull(message = "子客户编码不能为空")
    private String childCustomerCode;
        
    /**
      * 子客户名称
      */
    @ApiModelProperty("子客户名称")
    @NotNull(message = "子客户名称不能为空")
    private String childCustomerName;
        
    /**
      * 发生时间
      */
    @ApiModelProperty("发生时间")
    @NotNull(message = "发生时间不能为空")
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
    @NotNull(message = "应付金额不能为空")
    private BigDecimal receivableAmount;
        
    /**
      * 对账金额
      */
    @ApiModelProperty("对账金额")
    @NotNull(message = "对账金额不能为空")
    private BigDecimal sourceStatementAmount;
        
    /**
      * 物流模式 1代表默认无意义
      */
    @ApiModelProperty("物流模式 1代表默认无意义")
    @NotNull(message = "物流模式 1代表默认无意义不能为空")
    private Integer logisticsPattern;
        
    /**
      * 是否补单 2代表默认无意义
      */
    @ApiModelProperty("是否补单 2代表默认无意义")
    @NotNull(message = "是否补单 2代表默认无意义不能为空")
    private Integer whetherRepairBill;
        
    /**
      * 单据类型
      */
    @ApiModelProperty("单据类型")
    @NotNull(message = "单据类型不能为空")
    private Integer billType;
        
    /**
      * 履约地点编码
      */
    @ApiModelProperty("履约地点编码")
    @NotNull(message = "履约地点编码不能为空")
    private String appointPlaceCode;
        
    /**
      * 履约地点名称
      */
    @ApiModelProperty("履约地点名称")
    @NotNull(message = "履约地点名称不能为空")
    private String appointPlaceName;
        
    /**
      * 签约公司编码
      */
    @ApiModelProperty("签约公司编码")
    @NotNull(message = "签约公司编码不能为空")
    private String signCompanyCode;
        
    /**
      * 签约公司名称
      */
    @ApiModelProperty("签约公司名称")
    @NotNull(message = "签约公司名称不能为空")
    private String signCompanyName;
        
    /**
      * 对账单号
      */
    @ApiModelProperty("对账单号")
    @NotNull(message = "对账单号不能为空")
    private String statementNo;
        
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
        
    public EntityWrapper<SssSourceBillDO> queryWrapper() {
        EntityWrapper<SssSourceBillDO> ew = new EntityWrapper<>();
            if (Objects.nonNull(id)) {
            ew.eq("id", id);
        }
            if (Objects.nonNull(sourceBillNo)) {
            ew.eq("source_bill_no", sourceBillNo);
        }
            if (Objects.nonNull(childCustomerCode)) {
            ew.eq("child_customer_code", childCustomerCode);
        }
            if (Objects.nonNull(childCustomerName)) {
            ew.eq("child_customer_name", childCustomerName);
        }
            if (Objects.nonNull(happenedDate)) {
            ew.eq("happened_date", happenedDate);
        }
            if (Objects.nonNull(paymentAmount)) {
            ew.eq("payment_amount", paymentAmount);
        }
            if (Objects.nonNull(receivableAmount)) {
            ew.eq("receivable_amount", receivableAmount);
        }
            if (Objects.nonNull(sourceStatementAmount)) {
            ew.eq("source_statement_amount", sourceStatementAmount);
        }
            if (Objects.nonNull(logisticsPattern)) {
            ew.eq("logistics_pattern", logisticsPattern);
        }
            if (Objects.nonNull(whetherRepairBill)) {
            ew.eq("whether_repair_bill", whetherRepairBill);
        }
            if (Objects.nonNull(billType)) {
            ew.eq("bill_type", billType);
        }
            if (Objects.nonNull(appointPlaceCode)) {
            ew.eq("appoint_place_code", appointPlaceCode);
        }
            if (Objects.nonNull(appointPlaceName)) {
            ew.eq("appoint_place_name", appointPlaceName);
        }
            if (Objects.nonNull(signCompanyCode)) {
            ew.eq("sign_company_code", signCompanyCode);
        }
            if (Objects.nonNull(signCompanyName)) {
            ew.eq("sign_company_name", signCompanyName);
        }
            if (Objects.nonNull(statementNo)) {
            ew.eq("statement_no", statementNo);
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

    public Page<SssSourceBillDO> page() {
        return new Page<>(current, size);
    }
    
}