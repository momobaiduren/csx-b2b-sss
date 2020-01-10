package com.yh.csx.sss.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.sss.dao.model.entity.SssCollectDO;
import com.yh.csx.sss.service.request.SssCollectRequest;
import java.util.List;


/**
 * 
 * @author zhangLong
 * @since 2020-01-09 21:06:17
 */
public interface SssCollectService {
   
    Page<SssCollectDO> loadPage( SssCollectRequest sssCollectRequest );

    List<SssCollectDO> loadList( SssCollectRequest sssCollectRequest );

    SssCollectDO loadDetail( Long id );

    void saveSssCollect( SssCollectRequest sssCollectRequest );

    void updateSssCollect( SssCollectRequest sssCollectRequest );
    
    void exportSssCollect( SssCollectRequest sssCollectRequest );
    
}