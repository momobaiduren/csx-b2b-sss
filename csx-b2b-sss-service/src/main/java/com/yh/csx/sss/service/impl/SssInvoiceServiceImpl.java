package com.yh.csx.sss.service.impl;



import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.sss.core.easyexcel.EasyExcelExecutor;
import com.yh.csx.sss.core.easyexcel.ExportSheetDetail;
import com.yh.csx.sss.service.excel.SssInvoiceExcel;
import com.yh.csx.sss.dao.repository.SssInvoiceRepository;
import com.yh.csx.sss.dao.model.entity.SssInvoiceDO;
import com.yh.csx.sss.service.request.SssInvoiceRequest;
import com.yh.csx.sss.service.response.SssInvoiceResponse;
import com.yh.csx.sss.service.SssInvoiceService;
import com.baomidou.mybatisplus.plugins.Page;
import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/**
 * 发票表添加校验
 * @author zhangLong
 * @since 2020-01-09 21:23:30
 */
@Service
public class SssInvoiceServiceImpl implements SssInvoiceService{
    @Resource
    private SssInvoiceRepository sssInvoiceRepository;

    @Override
    public Page<SssInvoiceDO> loadPage( SssInvoiceRequest sssInvoiceRequest ) {
        return sssInvoiceRepository.selectPage( sssInvoiceRequest.page(), sssInvoiceRequest.queryWrapper());
    }

    @Override   
    public List<SssInvoiceDO> loadList( SssInvoiceRequest sssInvoiceRequest ) {
        return sssInvoiceRepository.selectList(sssInvoiceRequest.queryWrapper());
    }

    @Override
    public SssInvoiceDO loadDetail( Long id ) {
        return sssInvoiceRepository.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveSssInvoice( SssInvoiceRequest sssInvoiceRequest ) {
        sssInvoiceRepository.insert(Mapper.map(sssInvoiceRequest, SssInvoiceDO.class));
    }
    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSssInvoice( SssInvoiceRequest sssInvoiceRequest ) {
        sssInvoiceRepository.update(Mapper.map(sssInvoiceRequest, SssInvoiceDO.class), sssInvoiceRequest.queryWrapper());
    }
    
    @Override
    public void exportSssInvoice( SssInvoiceRequest sssInvoiceRequest ) {
        final List<SssInvoiceDO> list = sssInvoiceRepository
            .selectList(sssInvoiceRequest.queryWrapper());
        final List<ExportSheetDetail<SssInvoiceExcel, SssInvoiceDO>> exportSheetDetails = new ArrayList<>();
        final ExportSheetDetail<SssInvoiceExcel, SssInvoiceDO> exportExportSheetDetail =
            new ExportSheetDetail<>(SssInvoiceExcel.class, list,"发票", null, 0);
        exportSheetDetails.add(exportExportSheetDetail);
        EasyExcelExecutor.exportMoreSheet( "发票", exportSheetDetails);
    }
    
}