package com.wzf.design.proxy.jdk_dynamic_datasource;

import java.util.Date;

/**
 * @Author: HERO
 * @Date: 2020/4/6 8:20
 * @Version 1.0
 */
public class DynamicDataSourceDemo {

    public static void main(String[] args) {

        Order order = new Order(1,"234234",new Date());
        OrderService orderService = new OrderService(new OrderDao());
        IOrderService proxy = (IOrderService) new DynamicDataSourceProxy().getInstance(orderService);
        proxy.create(order);


    }

}
