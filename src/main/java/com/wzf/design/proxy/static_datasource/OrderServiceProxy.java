package com.wzf.design.proxy.static_datasource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: HERO
 * @Date: 2020/4/2 15:19
 * @Version 1.0
 */
public class OrderServiceProxy implements IOrderService{

    OrderService target;

    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public void createOrder(Order order) throws ParseException {
        before();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String year = sdf.format(new Date());
        DynamicDataSourceEntry.set(year);
        System.out.println("链接数据库DB_"+year);
        target.createOrder(order);
        after();
    }


    void before(){
        System.out.println("前置通知");
    }

    void after(){
        System.out.println("后置通知");
    }
}
