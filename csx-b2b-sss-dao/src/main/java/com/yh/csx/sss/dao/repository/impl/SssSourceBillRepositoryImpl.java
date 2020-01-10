package com.yh.csx.sss.dao.repository.impl;


import com.yh.csx.sss.dao.mapper.SssSourceBillMapper;
import com.yh.csx.sss.dao.model.entity.SssSourceBillDO;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yh.csx.sss.dao.repository.SssSourceBillRepository;
import org.springframework.stereotype.Repository;


/**
 * 客户对账来源单
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Repository
public class SssSourceBillRepositoryImpl extends ServiceImpl<SssSourceBillMapper, SssSourceBillDO> implements SssSourceBillRepository {

}