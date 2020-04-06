package com.wzf.design.proxy.static_datasource;

/**
 * @Author: HERO
 * @Date: 2020/4/2 15:16
 * @Version 1.0
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {

        orderDao.insert(order);
    }

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
