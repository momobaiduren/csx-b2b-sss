package com.yh.csx.sss.service.impl;



import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.sss.core.easyexcel.EasyExcelExecutor;
import com.yh.csx.sss.core.easyexcel.ExportSheetDetail;
import com.yh.csx.sss.service.excel.SssSourceBillExcel;
import com.yh.csx.sss.dao.repository.SssSourceBillRepository;
import com.yh.csx.sss.dao.model.entity.SssSourceBillDO;
import com.yh.csx.sss.service.request.SssSourceBillRequest;
import com.yh.csx.sss.service.response.SssSourceBillResponse;
import com.yh.csx.sss.service.SssSourceBillService;
import com.baomidou.mybatisplus.plugins.Page;
import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/**
 * 客户对账来源单添加校验
 * @author zhangLong
 * @since 2020-01-09 21:25:30
 */
@Service
public class SssSourceBillServiceImpl implements SssSourceBillService{
    @Resource
    private SssSourceBillRepository sssSourceBillRepository;

    @Override
    public Page<SssSourceBillDO> loadPage( SssSourceBillRequest sssSourceBillRequest ) {
        return sssSourceBillRepository.selectPage( sssSourceBillRequest.page(), sssSourceBillRequest.queryWrapper());
    }

    @Override   
    public List<SssSourceBillDO> loadList( SssSourceBillRequest sssSourceBillRequest ) {
        return sssSourceBillRepository.selectList(sssSourceBillRequest.queryWrapper());
    }

    @Override
    public SssSourceBillDO loadDetail( Long id ) {
        return sssSourceBillRepository.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveSssSourceBill( SssSourceBillRequest sssSourceBillRequest ) {
        sssSourceBillRepository.insert(Mapper.map(sssSourceBillRequest, SssSourceBillDO.class));
    }
    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSssSourceBill( SssSourceBillRequest sssSourceBillRequest ) {
        sssSourceBillRepository.update(Mapper.map(sssSourceBillRequest, SssSourceBillDO.class), sssSourceBillRequest.queryWrapper());
    }
    
    @Override
    public void exportSssSourceBill( SssSourceBillRequest sssSourceBillRequest ) {
        final List<SssSourceBillDO> list = sssSourceBillRepository
            .selectList(sssSourceBillRequest.queryWrapper());
        final List<ExportSheetDetail<SssSourceBillExcel, SssSourceBillDO>> exportSheetDetails = new ArrayList<>();
        final ExportSheetDetail<SssSourceBillExcel, SssSourceBillDO> exportExportSheetDetail =
            new ExportSheetDetail<>(SssSourceBillExcel.class, list, "",null, 0);
        exportSheetDetails.add(exportExportSheetDetail);
        EasyExcelExecutor.exportMoreSheet( "客户对账来源单", exportSheetDetails);
    }
    
}