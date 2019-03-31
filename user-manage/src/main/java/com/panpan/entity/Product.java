package com.panpan.entity;

import lombok.Data;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：product
 */
@Table(name = "product")
@Data
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：id */
    private Integer id;

    /**  数据库字段：adress */
    private String adress;

    /**  数据库字段：made_begin */
    private Date madeBegin;

    /**  数据库字段：made_to */
    private Date madeTo;

    /**  数据库字段：maker */
    private String maker;

    /**  数据库字段：name */
    private String name;

    /**  数据库字段：price */
    private BigDecimal price;
}
