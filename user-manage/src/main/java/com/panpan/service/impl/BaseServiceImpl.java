package com.panpan.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.panpan.mapper.BaseMapper;
import com.panpan.service.inter.BaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


import java.io.Serializable;
import java.util.List;

/**
 * Created by panpan on 2019/3/31.
 */
@Service
public abstract class BaseServiceImpl<T,ID> implements BaseService<T,ID> {
    public abstract BaseMapper<T,ID> getMapper();

    @Override
    public T getById(ID id) {
        return getMapper().getById(id);
    }

    @Override
    public List<T> list(@Param("query") Query query) {
        return getMapper().list(query);
    }
}
