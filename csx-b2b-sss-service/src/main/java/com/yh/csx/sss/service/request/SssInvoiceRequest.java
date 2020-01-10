package com.yh.csx.sss.service.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;
import com.yh.csx.sss.dao.model.entity.SssInvoiceDO;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * 发票表请求入参
 *
 * @author zhangLong
 * @since 2020-01-09 21:23:30
 */
@Data
@ApiModel("发票表入参数据")
public class SssInvoiceRequest {

    @NotNull(message = "id不能为空")
    @ApiModelProperty("id")
    private Long id;

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
     * 发票种类
     */
    @ApiModelProperty("发票种类")
    @NotNull(message = "发票种类不能为空")
    private Integer invoiceType;

    /**
     * 发票代码
     */
    @ApiModelProperty("发票代码")
    @NotNull(message = "发票代码不能为空")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @ApiModelProperty("发票号码")
    @NotNull(message = "发票号码不能为空")
    private String invoiceNo;

    /**
     * 购方税号
     */
    @ApiModelProperty("购方税号")
    @NotNull(message = "购方税号不能为空")
    private String taxNo;

    /**
     * 购方地址
     */
    @ApiModelProperty("购方地址")
    @NotNull(message = "购方地址不能为空")
    private String address;

    /**
     * 购方电话
     */
    @ApiModelProperty("购方电话")
    @NotNull(message = "购方电话不能为空")
    private String telephone;

    /**
     * 购方银行卡号
     */
    @ApiModelProperty("购方银行卡号")
    @NotNull(message = "购方银行卡号不能为空")
    private String cardNumber;

    /**
     * 开票人
     */
    @ApiModelProperty("开票人")
    @NotNull(message = "开票人不能为空")
    private String drawer;

    /**
     * 开票日期
     */
    @ApiModelProperty("开票日期")
    @NotNull(message = "开票日期不能为空")
    private LocalDateTime makeOutDate;

    /**
     * 报送状态
     */
    @ApiModelProperty("报送状态")
    @NotNull(message = "报送状态不能为空")
    private Integer sendStatus;

    /**
     * 所属月份
     */
    @ApiModelProperty("所属月份")
    @NotNull(message = "所属月份不能为空")
    private String belongMonths;

    /**
     * 合计金额
     */
    @ApiModelProperty("合计金额")
    @NotNull(message = "合计金额不能为空")
    private BigDecimal totalAmount;

    /**
     * 税率
     */
    @ApiModelProperty("税率")
    @NotNull(message = "税率不能为空")
    private BigDecimal taxRate;

    /**
     * 合计税额
     */
    @ApiModelProperty("合计税额")
    @NotNull(message = "合计税额不能为空")
    private BigDecimal totalTaxAmount;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    @NotNull(message = "商品名称不能为空")
    private String goodsName;

    /**
     * 商品税目
     */
    @ApiModelProperty("商品税目")
    @NotNull(message = "商品税目不能为空")
    private String goodsTaxItem;

    /**
     * 签收人
     */
    @ApiModelProperty("签收人")
    @NotNull(message = "签收人不能为空")
    private String signer;

    /**
     * 签收日期
     */
    @ApiModelProperty("签收日期")
    @NotNull(message = "签收日期不能为空")
    private LocalDateTime signDate;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    @NotNull(message = "备注不能为空")
    private String remark;

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

    public EntityWrapper<SssInvoiceDO> queryWrapper() {
        EntityWrapper<SssInvoiceDO> ew = new EntityWrapper<>();
        if (Objects.nonNull(id)) {
            ew.eq("id", id);
        }
        if (Objects.nonNull(companyCode)) {
            ew.eq("company_code", companyCode);
        }
        if (Objects.nonNull(companyName)) {
            ew.eq("company_name", companyName);
        }
        if (Objects.nonNull(customerCode)) {
            ew.eq("customer_code", customerCode);
        }
        if (Objects.nonNull(customerName)) {
            ew.eq("customer_name", customerName);
        }
        if (Objects.nonNull(invoiceType)) {
            ew.eq("invoice_type", invoiceType);
        }
        if (Objects.nonNull(invoiceCode)) {
            ew.eq("invoice_code", invoiceCode);
        }
        if (Objects.nonNull(invoiceNo)) {
            ew.eq("invoice_no", invoiceNo);
        }
        if (Objects.nonNull(taxNo)) {
            ew.eq("tax_no", taxNo);
        }
        if (Objects.nonNull(address)) {
            ew.eq("address", address);
        }
        if (Objects.nonNull(telephone)) {
            ew.eq("telephone", telephone);
        }
        if (Objects.nonNull(cardNumber)) {
            ew.eq("card_number", cardNumber);
        }
        if (Objects.nonNull(drawer)) {
            ew.eq("drawer", drawer);
        }
        if (Objects.nonNull(makeOutDate)) {
            ew.eq("make_out_date", makeOutDate);
        }
        if (Objects.nonNull(sendStatus)) {
            ew.eq("send_status", sendStatus);
        }
        if (Objects.nonNull(belongMonths)) {
            ew.eq("belong_months", belongMonths);
        }
        if (Objects.nonNull(totalAmount)) {
            ew.eq("total_amount", totalAmount);
        }
        if (Objects.nonNull(taxRate)) {
            ew.eq("tax_rate", taxRate);
        }
        if (Objects.nonNull(totalTaxAmount)) {
            ew.eq("total_tax_amount", totalTaxAmount);
        }
        if (Objects.nonNull(goodsName)) {
            ew.eq("goods_name", goodsName);
        }
        if (Objects.nonNull(goodsTaxItem)) {
            ew.eq("goods_tax_item", goodsTaxItem);
        }
        if (Objects.nonNull(signer)) {
            ew.eq("signer", signer);
        }
        if (Objects.nonNull(signDate)) {
            ew.eq("sign_date", signDate);
        }
        if (Objects.nonNull(remark)) {
            ew.eq("remark", remark);
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

    public Page<SssInvoiceDO> page() {
        return new Page<>(current, size);
    }

}