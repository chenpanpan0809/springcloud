package com.panpan.mapper;

import com.panpan.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper  extends BaseMapper<Product,Integer> {
}
