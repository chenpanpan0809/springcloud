package com.panpan.controller;

import com.gitee.fastmybatis.core.query.Query;
import com.panpan.entity.Product;
import com.panpan.mapper.ProductMapper;
import com.panpan.service.inter.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by panpan on 2019/3/31.
 */
@RestController
@RequestMapping("userManage")
public class UserListController {

    @Autowired
    ProductService productService;

    @GetMapping("userList")
    public List<Product> userList(){
        Query query = new Query().setQueryAll(true);
        return  productService.list(query);
    }
}
