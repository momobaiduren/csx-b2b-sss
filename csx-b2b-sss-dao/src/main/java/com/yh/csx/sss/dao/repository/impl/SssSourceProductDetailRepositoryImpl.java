package com.yh.csx.sss.dao.repository.impl;


import com.yh.csx.sss.dao.mapper.SssSourceProductDetailMapper;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yh.csx.sss.dao.model.entity.SssSourceProductDetailDO;
import com.yh.csx.sss.dao.repository.SssSourceProductDetailRepository;
import org.springframework.stereotype.Repository;


/**
 * 来源单据商品详情
 * @author zhangLong
 * @since 2020-01-09 21:00:53
 */
@Repository
public class SssSourceProductDetailRepositoryImpl extends ServiceImpl<SssSourceProductDetailMapper, SssSourceProductDetailDO> implements SssSourceProductDetailRepository {

}