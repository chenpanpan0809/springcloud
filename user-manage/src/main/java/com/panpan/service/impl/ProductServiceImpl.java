package com.panpan.service.impl;

import com.panpan.entity.Product;
import com.panpan.mapper.BaseMapper;
import com.panpan.mapper.ProductMapper;
import com.panpan.service.inter.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by panpan on 2019/3/31.
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product,Integer> implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public BaseMapper getMapper() {
        return productMapper;
    }
}
