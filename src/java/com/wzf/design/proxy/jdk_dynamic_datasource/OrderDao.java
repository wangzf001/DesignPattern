package com.wzf.design.proxy.jdk_dynamic_datasource;

/**
 * @Author: HERO
 * @Date: 2020/4/4 17:43
 * @Version 1.0
 */
public class OrderDao {

    void insert(Order order){
        System.out.println(order.toString());
    }
}
