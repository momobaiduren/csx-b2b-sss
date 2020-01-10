package com.yh.csx.sss.controller;


import com.yh.csx.sss.service.SssStatementAccountService;
import com.yh.csx.sss.service.request.SssStatementAccountRequest;
import com.yh.csx.sss.service.response.SssStatementAccountResponse;
import com.yh.csx.sss.dao.model.entity.SssStatementAccountDO;
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
 * 客户对账单
 * @author zhangLong
 * @since 2020-01-09 21:30:50
 */
@RestController
@Api("客户对账单")
@RequestMapping("/api/caisx/b2b/sss/sssStatementAccount")
public class SssStatementAccountController{
    /**
     * 服务对象
     */
    @Resource
    private SssStatementAccountService sssStatementAccountService;

    /**
     * 分页查询所有数据
     * @param sssStatementAccountRequest 查询条件
     * @return 分页查询 
     */
    @GetMapping("/loadPage")
    @ApiOperation("条件分页查询客户对账单数据")
    public Wrapper<Page<SssStatementAccountResponse>> loadPage(SssStatementAccountRequest sssStatementAccountRequest){
        final Page<SssStatementAccountDO> sssStatementAccountPage = sssStatementAccountService.loadPage(sssStatementAccountRequest);
        Page<SssStatementAccountResponse> sssStatementAccountResponsePage = new Page<>(sssStatementAccountPage.getCurrent(), sssStatementAccountPage.getSize());
        if (CollectionUtils.isNotEmpty(sssStatementAccountPage.getRecords())) {
            sssStatementAccountResponsePage = Mapper
                .map(sssStatementAccountPage, SssStatementAccountResponse.class);
        }
        return WrapMapper.ok(sssStatementAccountResponsePage);
    }


    /**
     * 查询列表
     *
     * @param sssStatementAccountRequest 主键
     * @return 单条数据
     */
    @GetMapping("/loadList")
    @ApiOperation("条件列表查询客户对账单数据")
    public Wrapper<List<SssStatementAccountResponse>> loadList(SssStatementAccountRequest sssStatementAccountRequest) {
        final List<SssStatementAccountDO> sssStatementAccountList = sssStatementAccountService.loadList(sssStatementAccountRequest);
        List<SssStatementAccountResponse> sssStatementAccountResponseList = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(sssStatementAccountList)) {
            sssStatementAccountResponseList = Mapper.map(sssStatementAccountList, SssStatementAccountResponse.class);
        }
        return WrapMapper.ok(sssStatementAccountResponseList);
    }

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/loadDetail/{id}")
    @ApiOperation("id详情查询客户对账单数据")
    public Wrapper<SssStatementAccountResponse> loadDetail(@PathVariable Long id) {
    
        final  SssStatementAccountDO sssStatementAccount = sssStatementAccountService.loadDetail(id);
        SssStatementAccountResponse sssStatementAccountResponse = null;
        if(Objects.nonNull(sssStatementAccount)) {
            sssStatementAccountResponse = Mapper.map(sssStatementAccount, SssStatementAccountResponse.class);
        }
        return WrapMapper.ok(sssStatementAccountResponse);
    }

    /**
     * 新增数据
     *
     * @param sssStatementAccountRequest 查询条件
     * @return 新增结果
     */
    @PostMapping("/saveSssStatementAccount")
    @ApiOperation("保存客户对账单数据")
    public Wrapper<Void> saveSssStatementAccount(@Validated @RequestBody SssStatementAccountRequest sssStatementAccountRequest) {
        sssStatementAccountService.saveSssStatementAccount(sssStatementAccountRequest);
        return WrapMapper.ok();
    }

    /**
     * 修改数据
     *
     * @param sssStatementAccountRequest 查询条件
     * @return 修改结果
     */
    @PutMapping("/updateSssStatementAccount")
    @ApiOperation("修改客户对账单数据")
    public Wrapper<Void> updateSssStatementAccount(SssStatementAccountRequest sssStatementAccountRequest) {
        sssStatementAccountService.updateSssStatementAccount(sssStatementAccountRequest);
        return WrapMapper.ok();
    }
    
     /**
     * 导出
     * @param sssStatementAccountRequest 查询条件
     */
    @GetMapping("/exportSssStatementAccount")
    @ApiOperation("导出客户对账单数据")
    public void exportSssStatementAccount(SssStatementAccountRequest sssStatementAccountRequest ) {
        sssStatementAccountService.exportSssStatementAccount(sssStatementAccountRequest);
    }
}