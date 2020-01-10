package com.yh.csx.utils;

import com.yh.csx.bsf.core.base.mapper.Mapper;
import com.yh.csx.business.api.entity.CommonResponse;
import com.yh.csx.business.api.entity.Page;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author zhanglong
 * @since 2020/1/10  9:25 上午
 */
public class PageConvertUtils {

    public static <T, S> Page<T> convertPage( com.baomidou.mybatisplus.plugins.Page<S> sPage,
        Class<T> tClass ) {
        if (Objects.isNull(sPage)) {
            return null;
        }
        List<T> targetList = null;
        if (CollectionUtils.isNotEmpty(sPage.getRecords())) {
            targetList = Mapper.map(sPage.getRecords(), tClass);
        }
        return new Page<>(sPage.getCurrent(), sPage.getSize(), (int) sPage.getTotal(),
            targetList);
    }
}
