package com.yh.csx.sss.api.hystrix;


import com.yh.csx.business.api.entity.CommonResponse;
import com.yh.csx.business.api.entity.Page;
import com.yh.csx.sss.api.SssCollectFeignClientApi;

import com.yh.csx.sss.api.request.SssCollectRpcReq;
import com.yh.csx.sss.api.vo.SssCollectVO;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zhanglong
 */
public class SssCollectFeignHystrix implements SssCollectFeignClientApi {


    @Override
    public CommonResponse<Page<SssCollectVO>> loadSssCollectPage(
        SssCollectRpcReq sssCollectRequest ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<List<SssCollectVO>> loadSssCollectList( SssCollectRpcReq sssCollectRequest ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<SssCollectVO> loadSssCollectDetail( Long id ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<Void> saveSssCollect(@Validated @RequestBody SssCollectRpcReq sssCollectRequest ) {
        return CommonResponse.error();
    }

    @Override
    public CommonResponse<Void> updateSssCollect(@Validated @RequestBody SssCollectRpcReq sssCollectRequest ) {
        return CommonResponse.error();
    }
}