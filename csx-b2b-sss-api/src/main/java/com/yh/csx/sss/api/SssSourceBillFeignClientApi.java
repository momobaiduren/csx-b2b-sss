package com.yh.csx.sss.api;


import com.yh.csx.business.api.entity.CommonResponse;
import com.yh.csx.business.api.entity.PageResponse;
import com.yh.csx.sss.api.hystrix.SssSourceBillFeignHystrix;
import com.yh.csx.sss.api.request.SssSourceBillRpcReq;
import com.yh.csx.sss.api.vo.SssSourceBillVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 客户对账来源单
 *
 * @author zhangLong
 * @since 2020-01-09 21:35:02
 */
@RestController
@Api("客户对账来源单")
@FeignClient(value = "csx-b2b-sss-provider-rpc", fallback = SssSourceBillFeignHystrix.class)
public interface SssSourceBillFeignClientApi {

    /**
     * 分页查询所有数据
     *
     * @param sssSourceBillRpcReq 查询条件
     * @return 分页查询
     */
    @GetMapping("rpc/csx/sss/sssSourceBill/loadPage")
    @ApiOperation("条件分页查询客户对账来源单数据")
    CommonResponse<PageResponse<SssSourceBillVO>> loadSssSourceBillPage( SssSourceBillRpcReq sssSourceBillRpcReq );


    /**
     * 查询列表
     *
     * @param sssSourceBillRpcReq 主键
     * @return 单条数据
     */
    @GetMapping("rpc/csx/sss/sssSourceBill/loadList")
    @ApiOperation("条件列表查询客户对账来源单数据")
    CommonResponse<List<SssSourceBillVO>> loadSssSourceBillList( SssSourceBillRpcReq sssSourceBillRpcReq );

    /**
     * 查询详情
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("rpc/csx/sss/sssSourceBill/loadDetail/{id}")
    @ApiOperation("id详情查询客户对账来源单数据")
    CommonResponse<SssSourceBillVO> loadSssSourceBillDetail( @PathVariable Long id );

    /**
     * 新增数据
     *
     * @param sssSourceBillRpcReq 查询条件
     * @return 新增结果
     */
    @PostMapping("rpc/csx/sss/sssSourceBill/saveSssSourceBill")
    @ApiOperation("保存客户对账来源单数据")
    CommonResponse<Void> saveSssSourceBill(
        @Validated @RequestBody SssSourceBillRpcReq sssSourceBillRpcReq );

    /**
     * 修改数据
     *
     * @param sssSourceBillRpcReq 查询条件
     * @return 修改结果
     */
    @PutMapping("rpc/csx/sss/sssSourceBill/updateSssSourceBill")
    @ApiOperation("修改客户对账来源单数据")
    CommonResponse<Void> updateSssSourceBill( SssSourceBillRpcReq sssSourceBillRpcReq );

}