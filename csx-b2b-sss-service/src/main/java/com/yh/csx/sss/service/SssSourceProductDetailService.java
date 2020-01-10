package com.yh.csx.sss.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.sss.dao.model.entity.SssSourceProductDetailDO;
import com.yh.csx.sss.service.request.SssSourceProductDetailRequest;
import java.util.List;


/**
 * 来源单据商品详情
 * @author zhangLong
 * @since 2020-01-09 21:25:56
 */
public interface SssSourceProductDetailService {
   
    Page<SssSourceProductDetailDO> loadPage( SssSourceProductDetailRequest sssSourceProductDetailRequest );

    List<SssSourceProductDetailDO> loadList( SssSourceProductDetailRequest sssSourceProductDetailRequest );

    SssSourceProductDetailDO loadDetail( Long id );

    void saveSssSourceProductDetail( SssSourceProductDetailRequest sssSourceProductDetailRequest );

    void updateSssSourceProductDetail( SssSourceProductDetailRequest sssSourceProductDetailRequest );
    
    void exportSssSourceProductDetail( SssSourceProductDetailRequest sssSourceProductDetailRequest );
    
}