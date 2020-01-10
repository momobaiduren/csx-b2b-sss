package com.yh.csx.sss.controller;


import com.yh.csx.sss.service.SssSourceProductDetailService;
import com.yh.csx.sss.service.request.SssSourceProductDetailRequest;
import com.yh.csx.sss.service.response.SssSourceProductDetailResponse;
import com.yh.csx.sss.dao.model.entity.SssSourceProductDetailDO;
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
 * 来源单据商品详情
 * @author zhangLong
 * @since 2020-01-09 21:30:23
 */
@RestController
@Api("来源单据商品详情")
@RequestMapping("/api/sssSourceProductDetail")
public class SssSourceProductDetailController{
    /**
     * 服务对象
     */
    @Resource
    private SssSourceProductDetailService sssSourceProductDetailService;

    /**
     * 分页查询所有数据
     * @param sssSourceProductDetailRequest 查询条件
     * @return 分页查询 
     */
    @GetMapping("/loadPage")
    @ApiOperation("条件分页查询来源单据商品详情数据")
    public Wrapper<Page<SssSourceProductDetailResponse>> loadPage(SssSourceProductDetailRequest sssSourceProductDetailRequest){
        final Page<SssSourceProductDetailDO> sssSourceProductDetailPage = sssSourceProductDetailService.loadPage(sssSourceProductDetailRequest);
        Page<SssSourceProductDetailResponse> sssSourceProductDetailResponsePage = new Page<>(sssSourceProductDetailPage.getCurrent(), sssSourceProductDetailPage.getSize());
        if (CollectionUtils.isNotEmpty(sssSourceProductDetailPage.getRecords())) {
            sssSourceProductDetailResponsePage = Mapper
                .map(sssSourceProductDetailPage, SssSourceProductDetailResponse.class);
        }
        return WrapMapper.ok(sssSourceProductDetailResponsePage);
    }


    /**
     * 查询列表
     *
     * @param sssSourceProductDetailRequest 主键
     * @return 单条数据
     */
    @GetMapping("/loadList")
    @ApiOperation("条件列表查询来源单据商品详情数据")
    public Wrapper<List<SssSourceProductDetailResponse>> loadList(SssSourceProductDetailRequest sssSourceProductDetailRequest) {
        final List<SssSourceProductDetailDO> sssSourceProductDetailList = sssSourceProductDetailService.loadList(sssSourceProductDetailRequest);
        List<SssSourceProductDetailResponse> sssSourceProductDetailResponseList = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(sssSourceProductDetailList)) {
            sssSourceProductDetailResponseList = Mapper.map(sssSourceProductDetailList, SssSourceProductDetailResponse.class);
        }
        return WrapMapper.ok(sssSourceProductDetailResponseList);
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/loadDetail/{id}")
    @ApiOperation("id详情查询来源单据商品详情数据")
    public Wrapper<SssSourceProductDetailResponse> loadDetail(@PathVariable Long id) {
    
        final  SssSourceProductDetailDO sssSourceProductDetail = sssSourceProductDetailService.loadDetail(id);
        SssSourceProductDetailResponse sssSourceProductDetailResponse = null;
        if(Objects.nonNull(sssSourceProductDetail)) {
            sssSourceProductDetailResponse = Mapper.map(sssSourceProductDetail, SssSourceProductDetailResponse.class);
        }
        return WrapMapper.ok(sssSourceProductDetailResponse);
    }

    /**
     * 新增数据
     *
     * @param sssSourceProductDetailRequest 查询条件
     * @return 新增结果
     */
    @PostMapping("/saveSssSourceProductDetail")
    @ApiOperation("保存来源单据商品详情数据")
    public Wrapper<Void> saveSssSourceProductDetail(@Validated @RequestBody SssSourceProductDetailRequest sssSourceProductDetailRequest) {
        sssSourceProductDetailService.saveSssSourceProductDetail(sssSourceProductDetailRequest);
        return WrapMapper.ok();
    }

    /**
     * 修改数据
     *
     * @param sssSourceProductDetailRequest 查询条件
     * @return 修改结果
     */
    @PutMapping("/updateSssSourceProductDetail")
    @ApiOperation("修改来源单据商品详情数据")
    public Wrapper<Void> updateSssSourceProductDetail(SssSourceProductDetailRequest sssSourceProductDetailRequest) {
        sssSourceProductDetailService.updateSssSourceProductDetail(sssSourceProductDetailRequest);
        return WrapMapper.ok();
    }
    
     /**
     * 导出
     * @param sssSourceProductDetailRequest 查询条件
     */
    @GetMapping("/exportSssSourceProductDetail")
    @ApiOperation("导出来源单据商品详情数据")
    public void exportSssSourceProductDetail(SssSourceProductDetailRequest sssSourceProductDetailRequest ) {
        sssSourceProductDetailService.exportSssSourceProductDetail(sssSourceProductDetailRequest);
    }
}