package com.yh.csx.sss.dao.repository.impl;


import com.yh.csx.sss.dao.mapper.SssStatementAccountMapper;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yh.csx.sss.dao.model.entity.SssStatementAccountDO;
import com.yh.csx.sss.dao.repository.SssStatementAccountRepository;
import org.springframework.stereotype.Repository;


/**
 * 客户对账单
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Repository
public class SssStatementAccountRepositoryImpl extends ServiceImpl<SssStatementAccountMapper, SssStatementAccountDO> implements SssStatementAccountRepository {

}