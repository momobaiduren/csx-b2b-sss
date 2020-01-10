package com.yh.csx.sss.rpc;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.business.api.entity.CommonResponse;
import com.yh.csx.sss.api.SssCollectFeignClientApi;
import com.yh.csx.sss.api.request.SssCollectRpcReq;
import com.yh.csx.sss.api.vo.SssCollectVO;
import com.yh.csx.sss.dao.model.entity.SssCollectDO;
import com.yh.csx.sss.service.SssCollectService;
import com.yh.csx.sss.service.request.SssCollectRequest;
import com.yh.csx.utils.PageConvertUtils;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author zhangLong
 * @since 2020-01-10 09:15:21
 */
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SssCollectFeignClient implements SssCollectFeignClientApi {

    /**
     * 服务对象
     */
    @Resource
    private SssCollectService sssCollectService;

    /**
     * 分页查询所有数据
     *
     * @param sssCollectRpcReq 查询条件
     * @return 分页查询
     */
    @Override
    public CommonResponse<com.yh.csx.business.api.entity.Page<SssCollectVO>> loadSssCollectPage(
        SssCollectRpcReq sssCollectRpcReq ) {
        final SssCollectRequest request = Mapper.map(sssCollectRpcReq, SssCollectRequest.class);
        final Page<SssCollectDO> sssCollectPage = sssCollectService.loadPage(request);
        return CommonResponse
            .success(PageConvertUtils.convertPage(sssCollectPage, SssCollectVO.class));
    }

    @Override
    public CommonResponse<List<SssCollectVO>> loadSssCollectList( SssCollectRpcReq sssCollectRequest ) {
        return null;
    }

    @Override
    public CommonResponse<SssCollectVO> loadSssCollectDetail( Long id ) {
        return null;
    }

    @Override
    public CommonResponse<Void> saveSssCollect(@Validated @RequestBody SssCollectRpcReq sssCollectRequest ) {
        return null;
    }

    @Override
    public CommonResponse<Void> updateSssCollect(@Validated @RequestBody SssCollectRpcReq sssCollectRequest ) {
        return null;
    }


}