package com.yh.csx.sss.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.sss.dao.model.entity.SssSourceBillDO;
import com.yh.csx.sss.service.request.SssSourceBillRequest;
import java.util.List;


/**
 * 客户对账来源单
 * @author zhangLong
 * @since 2020-01-09 21:25:30
 */
public interface SssSourceBillService {
   
    Page<SssSourceBillDO> loadPage( SssSourceBillRequest sssSourceBillRequest );

    List<SssSourceBillDO> loadList( SssSourceBillRequest sssSourceBillRequest );

    SssSourceBillDO loadDetail( Long id );

    void saveSssSourceBill( SssSourceBillRequest sssSourceBillRequest );

    void updateSssSourceBill( SssSourceBillRequest sssSourceBillRequest );
    
    void exportSssSourceBill( SssSourceBillRequest sssSourceBillRequest );
    
}