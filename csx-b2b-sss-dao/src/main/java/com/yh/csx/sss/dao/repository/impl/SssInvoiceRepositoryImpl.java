package com.yh.csx.sss.dao.repository.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yh.csx.sss.dao.mapper.SssInvoiceMapper;
import com.yh.csx.sss.dao.model.entity.SssInvoiceDO;
import com.yh.csx.sss.dao.repository.SssInvoiceRepository;
import org.springframework.stereotype.Repository;


/**
 * 发票表
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Repository
public class SssInvoiceRepositoryImpl extends ServiceImpl<SssInvoiceMapper, SssInvoiceDO> implements SssInvoiceRepository {

}