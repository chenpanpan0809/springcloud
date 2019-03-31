package com.panpan.service.inter;

import com.gitee.fastmybatis.core.query.Query;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by panpan on 2019/3/31.
 */
public interface BaseService<T,ID> {
    T getById(ID id);
    List<T> list(@Param("query") Query var1);
}
