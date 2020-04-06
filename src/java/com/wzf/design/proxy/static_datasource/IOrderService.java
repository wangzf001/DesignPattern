package com.wzf.design.proxy.static_datasource;

import java.text.ParseException;

/**
 * @Author: HERO
 * @Date: 2020/4/2 15:16
 * @Version 1.0
 */
public interface IOrderService {

    void createOrder(Order order) throws ParseException;
}
