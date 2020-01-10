package com.yh.csx.sss.service.impl;


import com.baomidou.mybatisplus.plugins.Page;
import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.sss.core.easyexcel.EasyExcelExecutor;
import com.yh.csx.sss.core.easyexcel.ExportSheetDetail;
import com.yh.csx.sss.dao.model.entity.SssCollectDO;
import com.yh.csx.sss.dao.repository.SssCollectRepository;
import com.yh.csx.sss.service.SssCollectService;
import com.yh.csx.sss.service.excel.SssCollectExcel;
import com.yh.csx.sss.service.request.SssCollectRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 添加校验
 * @author zhangLong
 * @since 2020-01-09 21:06:19
 */
@Service
public class SssCollectServiceImpl implements SssCollectService{
    @Resource
    private SssCollectRepository sssCollectRepository;

    @Override
    public Page<SssCollectDO> loadPage( SssCollectRequest sssCollectRequest ) {
        return sssCollectRepository.selectPage( sssCollectRequest.page(), sssCollectRequest.queryWrapper());
    }

    @Override   
    public List<SssCollectDO> loadList( SssCollectRequest sssCollectRequest ) {
        return sssCollectRepository.selectList(sssCollectRequest.queryWrapper());
    }

    @Override
    public SssCollectDO loadDetail( Long id ) {
        return sssCollectRepository.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveSssCollect( SssCollectRequest sssCollectRequest ) {
        sssCollectRepository.insert(Mapper.map(sssCollectRequest, SssCollectDO.class));
    }
    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSssCollect( SssCollectRequest sssCollectRequest ) {
        sssCollectRepository.update(Mapper.map(sssCollectRequest, SssCollectDO.class), sssCollectRequest.queryWrapper());
    }
    
    @Override
    public void exportSssCollect( SssCollectRequest sssCollectRequest ) {
        final List<SssCollectDO> list = sssCollectRepository
            .selectList(sssCollectRequest.queryWrapper());
        final List<ExportSheetDetail<SssCollectExcel, SssCollectDO>> exportSheetDetails = new ArrayList<>();
        final ExportSheetDetail<SssCollectExcel, SssCollectDO> exportExportSheetDetail =
            new ExportSheetDetail<>(SssCollectExcel.class, list, "Collect", null, null);
        exportSheetDetails.add(exportExportSheetDetail);
        EasyExcelExecutor.exportMoreSheet( "sss_collect", exportSheetDetails);
    }
    
}