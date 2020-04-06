package com.wzf.design.proxy.static_datasource;

import java.text.ParseException;

/**
 * @Author: HERO
 * @Date: 2020/4/2 17:32
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {

        try {
            OrderDao orderDao = new OrderDao();
            OrderServiceProxy proxy  = new OrderServiceProxy(new OrderService(orderDao));
            proxy.createOrder(new Order());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
