package com.yh.csx.sss.service.impl;


import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.sss.core.easyexcel.EasyExcelExecutor;
import com.yh.csx.sss.core.easyexcel.ExportSheetDetail;
import com.yh.csx.sss.service.excel.SssSourceProductDetailExcel;
import com.yh.csx.sss.dao.repository.SssSourceProductDetailRepository;
import com.yh.csx.sss.dao.model.entity.SssSourceProductDetailDO;
import com.yh.csx.sss.service.request.SssSourceProductDetailRequest;
import com.yh.csx.sss.service.response.SssSourceProductDetailResponse;
import com.yh.csx.sss.service.SssSourceProductDetailService;
import com.baomidou.mybatisplus.plugins.Page;
import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/**
 * 来源单据商品详情添加校验
 *
 * @author zhangLong
 * @since 2020-01-09 21:25:56
 */
@Service
public class SssSourceProductDetailServiceImpl implements SssSourceProductDetailService {

    @Resource
    private SssSourceProductDetailRepository sssSourceProductDetailRepository;

    @Override
    public Page<SssSourceProductDetailDO> loadPage(
        SssSourceProductDetailRequest sssSourceProductDetailRequest ) {
        return sssSourceProductDetailRepository.selectPage(sssSourceProductDetailRequest.page(),
            sssSourceProductDetailRequest.queryWrapper());
    }

    @Override
    public List<SssSourceProductDetailDO> loadList(
        SssSourceProductDetailRequest sssSourceProductDetailRequest ) {
        return sssSourceProductDetailRepository
            .selectList(sssSourceProductDetailRequest.queryWrapper());
    }

    @Override
    public SssSourceProductDetailDO loadDetail( Long id ) {
        return sssSourceProductDetailRepository.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveSssSourceProductDetail(
        SssSourceProductDetailRequest sssSourceProductDetailRequest ) {
        sssSourceProductDetailRepository.insert(
            Mapper.map(sssSourceProductDetailRequest, SssSourceProductDetailDO.class));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSssSourceProductDetail(
        SssSourceProductDetailRequest sssSourceProductDetailRequest ) {
        sssSourceProductDetailRepository
            .update(Mapper.map(sssSourceProductDetailRequest, SssSourceProductDetailDO.class),
                sssSourceProductDetailRequest.queryWrapper());
    }

    @Override
    public void exportSssSourceProductDetail(
        SssSourceProductDetailRequest sssSourceProductDetailRequest ) {
        final List<SssSourceProductDetailDO> list = sssSourceProductDetailRepository
            .selectList(sssSourceProductDetailRequest.queryWrapper());
        final List<ExportSheetDetail<SssSourceProductDetailExcel, SssSourceProductDetailDO>> exportSheetDetails = new ArrayList<>();
        final ExportSheetDetail<SssSourceProductDetailExcel, SssSourceProductDetailDO> exportExportSheetDetail =
            new ExportSheetDetail<>(SssSourceProductDetailExcel.class, list, "来源单据商品详情", null, 1);
        exportSheetDetails.add(exportExportSheetDetail);
        EasyExcelExecutor.exportMoreSheet("来源单据商品详情", exportSheetDetails);
    }

}