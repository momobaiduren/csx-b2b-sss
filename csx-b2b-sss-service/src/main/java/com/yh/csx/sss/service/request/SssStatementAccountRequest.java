package com.yh.csx.sss.service.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import com.yh.csx.sss.dao.model.entity.SssStatementAccountDO;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;
/**
 * 客户对账单请求入参
 * @author zhangLong
 * @since 2020-01-09 21:26:54
 */
@Data
@ApiModel("客户对账单入参数据")
public class SssStatementAccountRequest {
    @NotNull(message = "id不能为空")
    @ApiModelProperty("id")
    private Long id;
        
    /**
      * 对账单号
      */
    @ApiModelProperty("对账单号")
    @NotNull(message = "对账单号不能为空")
    private String statementNo;
        
    /**
      * 客户对账日期
      */
    @ApiModelProperty("客户对账日期")
    @NotNull(message = "客户对账日期不能为空")
    private Date customerStatementDate;
        
    /**
      * 对账金额
      */
    @ApiModelProperty("对账金额")
    @NotNull(message = "对账金额不能为空")
    private BigDecimal statementAmount;
        
    /**
      * 客户对账人
      */
    @ApiModelProperty("客户对账人")
    @NotNull(message = "客户对账人不能为空")
    private String customerPerson;
        
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
      * 建议开票总金额
      */
    @ApiModelProperty("建议开票总金额")
    @NotNull(message = "建议开票总金额不能为空")
    private BigDecimal suggestiNvoiceAmount;
        
    /**
      * 税率0%
      */
    @ApiModelProperty("税率0%")
    @NotNull(message = "税率0%不能为空")
    private BigDecimal taxAmount00;
        
    /**
      * 税率9%
      */
    @ApiModelProperty("税率9%")
    @NotNull(message = "税率9%不能为空")
    private BigDecimal taxAmount09;
        
    /**
      * 税率13%
      */
    @ApiModelProperty("税率13%")
    @NotNull(message = "税率13%不能为空")
    private BigDecimal taxAmount13;
        
    /**
      * 签收单额
      */
    @ApiModelProperty("签收单额")
    @NotNull(message = "签收单额不能为空")
    private BigDecimal signBillAmount;
        
    /**
      * 签收单额
      */
    @ApiModelProperty("签收单额")
    @NotNull(message = "签收单额不能为空")
    private BigDecimal outBillAmount;
        
    /**
      * 返利额
      */
    @ApiModelProperty("返利额")
    @NotNull(message = "返利额不能为空")
    private BigDecimal rebateAmount;
        
    /**
      * 尾差调整额
      */
    @ApiModelProperty("尾差调整额")
    @NotNull(message = "尾差调整额不能为空")
    private BigDecimal tailAdjustmentAmount;
        
    /**
      * 对账状态
      */
    @ApiModelProperty("对账状态")
    @NotNull(message = "对账状态不能为空")
    private Integer statementState;
        
    /**
      * 开票单号
      */
    @ApiModelProperty("开票单号")
    @NotNull(message = "开票单号不能为空")
    private String invoiceNo;
        
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
        
    public EntityWrapper<SssStatementAccountDO> queryWrapper() {
        EntityWrapper<SssStatementAccountDO> ew = new EntityWrapper<>();
            if (Objects.nonNull(id)) {
            ew.eq("id", id);
        }
            if (Objects.nonNull(statementNo)) {
            ew.eq("statement_no", statementNo);
        }
            if (Objects.nonNull(customerStatementDate)) {
            ew.eq("customer_statement_date", customerStatementDate);
        }
            if (Objects.nonNull(statementAmount)) {
            ew.eq("statement_amount", statementAmount);
        }
            if (Objects.nonNull(customerPerson)) {
            ew.eq("customer_person", customerPerson);
        }
            if (Objects.nonNull(signCompanyCode)) {
            ew.eq("sign_company_code", signCompanyCode);
        }
            if (Objects.nonNull(signCompanyName)) {
            ew.eq("sign_company_name", signCompanyName);
        }
            if (Objects.nonNull(suggestiNvoiceAmount)) {
            ew.eq("suggesti_nvoice_amount", suggestiNvoiceAmount);
        }
            if (Objects.nonNull(taxAmount00)) {
            ew.eq("tax_amount00", taxAmount00);
        }
            if (Objects.nonNull(taxAmount09)) {
            ew.eq("tax_amount09", taxAmount09);
        }
            if (Objects.nonNull(taxAmount13)) {
            ew.eq("tax_amount13", taxAmount13);
        }
            if (Objects.nonNull(signBillAmount)) {
            ew.eq("sign_bill_amount", signBillAmount);
        }
            if (Objects.nonNull(outBillAmount)) {
            ew.eq("out_bill_amount", outBillAmount);
        }
            if (Objects.nonNull(rebateAmount)) {
            ew.eq("rebate_amount", rebateAmount);
        }
            if (Objects.nonNull(tailAdjustmentAmount)) {
            ew.eq("tail_adjustment_amount", tailAdjustmentAmount);
        }
            if (Objects.nonNull(statementState)) {
            ew.eq("statement_state", statementState);
        }
            if (Objects.nonNull(invoiceNo)) {
            ew.eq("invoice_no", invoiceNo);
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

    public Page<SssStatementAccountDO> page() {
        return new Page<>(current, size);
    }
    
}