package com.wzf.design.proxy.jdk_dynamic_datasource;

/**
 * @Author: HERO
 * @Date: 2020/4/4 17:45
 * @Version 1.0
 */
public class OrderService implements IOrderService {

    private OrderDao orderDao;

    @Override
    public void create(Order order) {
        orderDao.insert(order);
    }

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
