package com.yh.csx.sss.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.sss.dao.model.entity.SssStatementAccountDO;
import com.yh.csx.sss.service.request.SssStatementAccountRequest;
import java.util.List;


/**
 * 客户对账单
 * @author zhangLong
 * @since 2020-01-09 21:26:54
 */
public interface SssStatementAccountService {
   
    Page<SssStatementAccountDO> loadPage( SssStatementAccountRequest sssStatementAccountRequest );

    List<SssStatementAccountDO> loadList( SssStatementAccountRequest sssStatementAccountRequest );

    SssStatementAccountDO loadDetail( Long id );

    void saveSssStatementAccount( SssStatementAccountRequest sssStatementAccountRequest );

    void updateSssStatementAccount( SssStatementAccountRequest sssStatementAccountRequest );
    
    void exportSssStatementAccount( SssStatementAccountRequest sssStatementAccountRequest );
    
}