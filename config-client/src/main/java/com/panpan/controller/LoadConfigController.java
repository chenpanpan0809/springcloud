package com.panpan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by panpan on 2019/3/31.
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class LoadConfigController {

    @Value("${name}")
    private String name;

    @GetMapping("/getConfig")
    public String getConfig(){
        return this.name;
    }

}
