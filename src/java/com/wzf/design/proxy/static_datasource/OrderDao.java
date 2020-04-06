package com.wzf.design.proxy.static_datasource;

/**
 * @Author: HERO
 * @Date: 2020/4/2 15:14
 * @Version 1.0
 */
public class OrderDao {

    void insert(Order order){
        System.out.println("写入订单成功:"+order.toString());
    }
}
