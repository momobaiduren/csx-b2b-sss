package com.yh.csx.sss.controller;


import com.yh.csx.sss.service.SssInvoiceService;
import com.yh.csx.sss.service.request.SssInvoiceRequest;
import com.yh.csx.sss.service.response.SssInvoiceResponse;
import com.yh.csx.sss.dao.model.entity.SssInvoiceDO;
import com.baomidou.mybatisplus.plugins.Page;
import java.util.ArrayList;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.bsf.core.base.wrapper.WrapMapper;
import com.yh.csx.bsf.core.base.wrapper.Wrapper;
import java.util.List;
import io.swagger.annotations.Api;
import org.apache.commons.collections4.CollectionUtils;
import io.swagger.annotations.ApiOperation;


/**
 * 发票表
 * @author zhangLong
 * @since 2020-01-09 21:27:32
 */
@RestController
@Api("发票表")
@RequestMapping("/api/sssInvoice")
public class SssInvoiceController{
    /**
     * 服务对象
     */
    @Resource
    private SssInvoiceService sssInvoiceService;

    /**
     * 分页查询所有数据
     * @param sssInvoiceRequest 查询条件
     * @return 分页查询 
     */
    @GetMapping("/loadPage")
    @ApiOperation("条件分页查询发票表数据")
    public Wrapper<Page<SssInvoiceResponse>> loadPage(SssInvoiceRequest sssInvoiceRequest){
        final Page<SssInvoiceDO> sssInvoicePage = sssInvoiceService.loadPage(sssInvoiceRequest);
        Page<SssInvoiceResponse> sssInvoiceResponsePage = new Page<>(sssInvoicePage.getCurrent(), sssInvoicePage.getSize());
        if (CollectionUtils.isNotEmpty(sssInvoicePage.getRecords())) {
            sssInvoiceResponsePage = Mapper
                .map(sssInvoicePage, SssInvoiceResponse.class);
        }
        return WrapMapper.ok(sssInvoiceResponsePage);
    }


    /**
     * 查询列表
     *
     * @param sssInvoiceRequest 主键
     * @return 单条数据
     */
    @GetMapping("/loadList")
    @ApiOperation("条件列表查询发票表数据")
    public Wrapper<List<SssInvoiceResponse>> loadList(SssInvoiceRequest sssInvoiceRequest) {
        final List<SssInvoiceDO> sssInvoiceList = sssInvoiceService.loadList(sssInvoiceRequest);
        List<SssInvoiceResponse> sssInvoiceResponseList = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(sssInvoiceList)) {
            sssInvoiceResponseList = Mapper.map(sssInvoiceList, SssInvoiceResponse.class);
        }
        return WrapMapper.ok(sssInvoiceResponseList);
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/loadDetail/{id}")
    @ApiOperation("id详情查询发票表数据")
    public Wrapper<SssInvoiceResponse> loadDetail(@PathVariable Long id) {
        final  SssInvoiceDO sssInvoice = sssInvoiceService.loadDetail(id);
        SssInvoiceResponse sssInvoiceResponse = null;
        if(Objects.nonNull(sssInvoice)) {
            sssInvoiceResponse = Mapper.map(sssInvoice, SssInvoiceResponse.class);
        }
        return WrapMapper.ok(sssInvoiceResponse);
    }

    /**
     * 新增数据
     *
     * @param sssInvoiceRequest 查询条件
     * @return 新增结果
     */
    @PostMapping("/saveSssInvoice")
    @ApiOperation("保存发票表数据")
    public Wrapper<Void> saveSssInvoice(@Validated @RequestBody SssInvoiceRequest sssInvoiceRequest) {
        sssInvoiceService.saveSssInvoice(sssInvoiceRequest);
        return WrapMapper.ok();
    }

    /**
     * 修改数据
     *
     * @param sssInvoiceRequest 查询条件
     * @return 修改结果
     */
    @PutMapping("/updateSssInvoice")
    @ApiOperation("修改发票表数据")
    public Wrapper<Void> updateSssInvoice(SssInvoiceRequest sssInvoiceRequest) {
        sssInvoiceService.updateSssInvoice(sssInvoiceRequest);
        return WrapMapper.ok();
    }
    
     /**
     * 导出
     * @param sssInvoiceRequest 查询条件
     */
    @GetMapping("/exportSssInvoice")
    @ApiOperation("导出发票表数据")
    public void exportSssInvoice(SssInvoiceRequest sssInvoiceRequest ) {
        sssInvoiceService.exportSssInvoice(sssInvoiceRequest);
    }
}