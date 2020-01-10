package com.yh.csx.sss.controller;


import com.yh.csx.sss.service.SssSourceBillService;
import com.yh.csx.sss.service.request.SssSourceBillRequest;
import com.yh.csx.sss.service.response.SssSourceBillResponse;
import com.yh.csx.sss.dao.model.entity.SssSourceBillDO;
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
 * 客户对账来源单
 * @author zhangLong
 * @since 2020-01-09 21:29:57
 */
@RestController
@Api("客户对账来源单")
@RequestMapping("/api/sssSourceBill")
public class SssSourceBillController{
    /**
     * 服务对象
     */
    @Resource
    private SssSourceBillService sssSourceBillService;

    /**
     * 分页查询所有数据
     * @param sssSourceBillRequest 查询条件
     * @return 分页查询 
     */
    @GetMapping("/loadPage")
    @ApiOperation("条件分页查询客户对账来源单数据")
    public Wrapper<Page<SssSourceBillResponse>> loadPage(SssSourceBillRequest sssSourceBillRequest){
        final Page<SssSourceBillDO> sssSourceBillPage = sssSourceBillService.loadPage(sssSourceBillRequest);
        Page<SssSourceBillResponse> sssSourceBillResponsePage = new Page<>(sssSourceBillPage.getCurrent(), sssSourceBillPage.getSize());
        if (CollectionUtils.isNotEmpty(sssSourceBillPage.getRecords())) {
            sssSourceBillResponsePage = Mapper
                .map(sssSourceBillPage, SssSourceBillResponse.class);
        }
        return WrapMapper.ok(sssSourceBillResponsePage);
    }


    /**
     * 查询列表
     *
     * @param sssSourceBillRequest 主键
     * @return 单条数据
     */
    @GetMapping("/loadList")
    @ApiOperation("条件列表查询客户对账来源单数据")
    public Wrapper<List<SssSourceBillResponse>> loadList(SssSourceBillRequest sssSourceBillRequest) {
        final List<SssSourceBillDO> sssSourceBillList = sssSourceBillService.loadList(sssSourceBillRequest);
        List<SssSourceBillResponse> sssSourceBillResponseList = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(sssSourceBillList)) {
            sssSourceBillResponseList = Mapper.map(sssSourceBillList, SssSourceBillResponse.class);
        }
        return WrapMapper.ok(sssSourceBillResponseList);
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/loadDetail/{id}")
    @ApiOperation("id详情查询客户对账来源单数据")
    public Wrapper<SssSourceBillResponse> loadDetail(@PathVariable Long id) {
    
        final  SssSourceBillDO sssSourceBill = sssSourceBillService.loadDetail(id);
        SssSourceBillResponse sssSourceBillResponse = null;
        if(Objects.nonNull(sssSourceBill)) {
            sssSourceBillResponse = Mapper.map(sssSourceBill, SssSourceBillResponse.class);
        }
        return WrapMapper.ok(sssSourceBillResponse);
    }

    /**
     * 新增数据
     *
     * @param sssSourceBillRequest 查询条件
     * @return 新增结果
     */
    @PostMapping("/saveSssSourceBill")
    @ApiOperation("保存客户对账来源单数据")
    public Wrapper<Void> saveSssSourceBill(@Validated @RequestBody SssSourceBillRequest sssSourceBillRequest) {
        sssSourceBillService.saveSssSourceBill(sssSourceBillRequest);
        return WrapMapper.ok();
    }

    /**
     * 修改数据
     *
     * @param sssSourceBillRequest 查询条件
     * @return 修改结果
     */
    @PutMapping("/updateSssSourceBill")
    @ApiOperation("修改客户对账来源单数据")
    public Wrapper<Void> updateSssSourceBill(SssSourceBillRequest sssSourceBillRequest) {
        sssSourceBillService.updateSssSourceBill(sssSourceBillRequest);
        return WrapMapper.ok();
    }
    
     /**
     * 导出
     * @param sssSourceBillRequest 查询条件
     */
    @GetMapping("/exportSssSourceBill")
    @ApiOperation("导出客户对账来源单数据")
    public void exportSssSourceBill(SssSourceBillRequest sssSourceBillRequest ) {
        sssSourceBillService.exportSssSourceBill(sssSourceBillRequest);
    }
}