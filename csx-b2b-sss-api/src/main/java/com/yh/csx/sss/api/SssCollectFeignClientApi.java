package com.yh.csx.sss.api;


import com.yh.csx.business.api.entity.CommonResponse;
import com.yh.csx.business.api.entity.Page;
import com.yh.csx.sss.api.hystrix.SssCollectFeignHystrix;
import com.yh.csx.sss.api.request.SssCollectRpcReq;
import com.yh.csx.sss.api.vo.SssCollectVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * @author zhangLong
 * @since 2020-01-09 21:33:42
 */
@RestController
@Api("")
@FeignClient(value = "csx-b2b-supplier-provider-rpc", fallback = SssCollectFeignHystrix.class)
public interface SssCollectFeignClientApi {

    /**
     * 分页查询所有数据
     *
     * @param sssCollectRequest 查询条件
     * @return 分页查询
     */
    @GetMapping("rpc/csx/sss/sssCollect/loadPage")
    @ApiOperation("条件分页查询数据")
    CommonResponse<Page<SssCollectVO>> loadSssCollectPage( SssCollectRpcReq sssCollectRequest );


    /**
     * 查询列表
     *
     * @param sssCollectRequest 主键
     * @return 单条数据
     */
    @GetMapping("rpc/csx/sss/sssCollect/loadList")
    @ApiOperation("条件列表查询数据")
    CommonResponse<List<SssCollectVO>> loadSssCollectList( SssCollectRpcReq sssCollectRequest );

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("rpc/csx/sss/sssCollect/loadDetail/{id}")
    @ApiOperation("id详情查询数据")
    CommonResponse<SssCollectVO> loadSssCollectDetail( @PathVariable Long id );

    /**
     * 新增数据
     *
     * @param sssCollectRequest 查询条件
     * @return 新增结果
     */
    @PostMapping("rpc/csx/sss/sssCollect/saveSssCollect")
    @ApiOperation("保存数据")
    CommonResponse<Void> saveSssCollect(
        @Validated @RequestBody SssCollectRpcReq sssCollectRequest );

    /**
     * 修改数据
     *
     * @param sssCollectRequest 查询条件
     * @return 修改结果
     */
    @PostMapping("rpc/csx/sss/sssCollect/updateSssCollect")
    @ApiOperation("修改数据")
    CommonResponse<Void> updateSssCollect(@Validated @RequestBody SssCollectRpcReq sssCollectRequest );

}