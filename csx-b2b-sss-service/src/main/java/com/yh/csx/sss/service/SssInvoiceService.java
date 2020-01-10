package com.yh.csx.sss.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.sss.dao.model.entity.SssInvoiceDO;
import com.yh.csx.sss.service.request.SssInvoiceRequest;
import java.util.List;


/**
 * 发票表
 * @author zhangLong
 * @since 2020-01-09 21:23:30
 */
public interface SssInvoiceService {
   
    Page<SssInvoiceDO> loadPage( SssInvoiceRequest sssInvoiceRequest );

    List<SssInvoiceDO> loadList( SssInvoiceRequest sssInvoiceRequest );

    SssInvoiceDO loadDetail( Long id );

    void saveSssInvoice( SssInvoiceRequest sssInvoiceRequest );

    void updateSssInvoice( SssInvoiceRequest sssInvoiceRequest );
    
    void exportSssInvoice( SssInvoiceRequest sssInvoiceRequest );
    
}