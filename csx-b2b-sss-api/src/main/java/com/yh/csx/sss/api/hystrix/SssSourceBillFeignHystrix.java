package com.yh.csx.sss.api.hystrix;


import com.yh.csx.business.api.entity.CommonResponse;
import com.yh.csx.business.api.entity.PageResponse;
import com.yh.csx.sss.api.SssSourceBillFeignClientApi;
import com.yh.csx.sss.api.request.SssSourceBillRpcReq;
import com.yh.csx.sss.api.vo.SssSourceBillVO;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zhanglong
 */
public class SssSourceBillFeignHystrix implements SssSourceBillFeignClientApi {


    @Override
    public CommonResponse<PageResponse<SssSourceBillVO>> loadSssSourceBillPage(
        SssSourceBillRpcReq sssSourceBillRpcReq ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<List<SssSourceBillVO>> loadSssSourceBillList(
        SssSourceBillRpcReq sssSourceBillRpcReq ) {
        return null;
    }

    @Override
    public CommonResponse<SssSourceBillVO> loadSssSourceBillDetail( Long id ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<Void> saveSssSourceBill(
        @Validated @RequestBody SssSourceBillRpcReq sssSourceBillRpcReq ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<Void> updateSssSourceBill(
        @Validated @RequestBody SssSourceBillRpcReq sssSourceBillRpcReq ) {
        return CommonResponse.error();
    }
}