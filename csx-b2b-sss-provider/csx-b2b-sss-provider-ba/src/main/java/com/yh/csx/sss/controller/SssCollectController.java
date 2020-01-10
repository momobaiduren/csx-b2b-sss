package com.yh.csx.sss.controller;


import com.yh.csx.sss.service.SssCollectService;
import com.yh.csx.sss.service.request.SssCollectRequest;
import com.yh.csx.sss.service.response.SssCollectResponse;
import com.yh.csx.sss.dao.model.entity.SssCollectDO;
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
 * 
 * @author zhangLong
 * @since 2020-01-09 21:19:46
 */
@RestController
@Api("fe")
@RequestMapping("/api/sssCollect")
public class SssCollectController{
    /**
     * 服务对象
     */
    @Resource
    private SssCollectService sssCollectService;

    /**
     * 分页查询所有数据
     * @param sssCollectRequest 查询条件
     * @return 分页查询 
     */
    @GetMapping("/loadPage")
    @ApiOperation("条件分页查询数据")
    public Wrapper<Page<SssCollectResponse>> loadPage(SssCollectRequest sssCollectRequest){
        final Page<SssCollectDO> sssCollectPage = sssCollectService.loadPage(sssCollectRequest);
        Page<SssCollectResponse> sssCollectResponsePage = new Page<>(sssCollectPage.getCurrent(), sssCollectPage.getSize());
        if (CollectionUtils.isNotEmpty(sssCollectPage.getRecords())) {
            sssCollectResponsePage = Mapper
                .map(sssCollectPage, SssCollectResponse.class);
        }
        return WrapMapper.ok(sssCollectResponsePage);
    }


    /**
     * 查询列表
     *
     * @param sssCollectRequest 主键
     * @return 单条数据
     */
    @GetMapping("/loadList")
    @ApiOperation("条件列表查询数据")
    public Wrapper<List<SssCollectResponse>> loadList(SssCollectRequest sssCollectRequest) {
        final List<SssCollectDO> sssCollectList = sssCollectService.loadList(sssCollectRequest);
        List<SssCollectResponse> sssCollectResponseList = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(sssCollectList)) {
            sssCollectResponseList = Mapper.map(sssCollectList, SssCollectResponse.class);
        }
        return WrapMapper.ok(sssCollectResponseList);
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/loadDetail/{id}")
    @ApiOperation("id详情查询数据")
    public Wrapper<SssCollectResponse> loadDetail(@PathVariable Long id) {
    
        final  SssCollectDO sssCollect = sssCollectService.loadDetail(id);
        SssCollectResponse sssCollectResponse = null;
        if(Objects.nonNull(sssCollect)) {
            sssCollectResponse = Mapper.map(sssCollect, SssCollectResponse.class);
        }
        return WrapMapper.ok(sssCollectResponse);
    }

    /**
     * 新增数据
     *
     * @param sssCollectRequest 查询条件
     * @return 新增结果
     */
    @PostMapping("/saveSssCollect")
    @ApiOperation("保存数据")
    public Wrapper<Void> saveSssCollect(@Validated @RequestBody SssCollectRequest sssCollectRequest) {
        sssCollectService.saveSssCollect(sssCollectRequest);
        return WrapMapper.ok();
    }

    /**
     * 修改数据
     *
     * @param sssCollectRequest 查询条件
     * @return 修改结果
     */
    @PutMapping("/updateSssCollect")
    @ApiOperation("修改数据")
    public Wrapper<Void> updateSssCollect(SssCollectRequest sssCollectRequest) {
        sssCollectService.updateSssCollect(sssCollectRequest);
        return WrapMapper.ok();
    }
    
     /**
     * 导出
     * @param sssCollectRequest 查询条件
     */
    @GetMapping("/exportSssCollect")
    @ApiOperation("导出数据")
    public void exportSssCollect(SssCollectRequest sssCollectRequest ) {
        sssCollectService.exportSssCollect(sssCollectRequest);
    }
}