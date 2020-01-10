package com.yh.csx.sss.service.impl;



import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.sss.core.easyexcel.EasyExcelExecutor;
import com.yh.csx.sss.core.easyexcel.ExportSheetDetail;
import com.yh.csx.sss.service.excel.SssStatementAccountExcel;
import com.yh.csx.sss.dao.repository.SssStatementAccountRepository;
import com.yh.csx.sss.dao.model.entity.SssStatementAccountDO;
import com.yh.csx.sss.service.request.SssStatementAccountRequest;
import com.yh.csx.sss.service.response.SssStatementAccountResponse;
import com.yh.csx.sss.service.SssStatementAccountService;
import com.baomidou.mybatisplus.plugins.Page;
import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/**
 * 客户对账单添加校验
 * @author zhangLong
 * @since 2020-01-09 21:26:54
 */
@Service
public class SssStatementAccountServiceImpl implements SssStatementAccountService{
    @Resource
    private SssStatementAccountRepository sssStatementAccountRepository;

    @Override
    public Page<SssStatementAccountDO> loadPage( SssStatementAccountRequest sssStatementAccountRequest ) {
        return sssStatementAccountRepository.selectPage( sssStatementAccountRequest.page(), sssStatementAccountRequest.queryWrapper());
    }

    @Override   
    public List<SssStatementAccountDO> loadList( SssStatementAccountRequest sssStatementAccountRequest ) {
        return sssStatementAccountRepository.selectList(sssStatementAccountRequest.queryWrapper());
    }

    @Override
    public SssStatementAccountDO loadDetail( Long id ) {
        return sssStatementAccountRepository.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveSssStatementAccount( SssStatementAccountRequest sssStatementAccountRequest ) {
        sssStatementAccountRepository.insert(
            Mapper.map(sssStatementAccountRequest, SssStatementAccountDO.class));
    }
    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSssStatementAccount( SssStatementAccountRequest sssStatementAccountRequest ) {
        sssStatementAccountRepository.update(Mapper.map(sssStatementAccountRequest, SssStatementAccountDO.class), sssStatementAccountRequest.queryWrapper());
    }
    
    @Override
    public void exportSssStatementAccount( SssStatementAccountRequest sssStatementAccountRequest ) {
        final List<SssStatementAccountDO> list = sssStatementAccountRepository
            .selectList(sssStatementAccountRequest.queryWrapper());
        final List<ExportSheetDetail<SssStatementAccountExcel, SssStatementAccountDO>> exportSheetDetails = new ArrayList<>();
        final ExportSheetDetail<SssStatementAccountExcel, SssStatementAccountDO> exportExportSheetDetail =
            new ExportSheetDetail<>(SssStatementAccountExcel.class, list,"客户对账单", null, 1);
        exportSheetDetails.add(exportExportSheetDetail);
        EasyExcelExecutor.exportMoreSheet( "客户对账单", exportSheetDetails);
    }
    
}