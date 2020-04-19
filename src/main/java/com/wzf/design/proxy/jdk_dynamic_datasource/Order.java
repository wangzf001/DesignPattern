package com.wzf.design.proxy.jdk_dynamic_datasource;

import java.util.Date;

/**
 * @Author: HERO
 * @Date: 2020/4/4 17:42
 * @Version 1.0
 */
public class Order {

    private Integer id;
    private String orderCode;
    private Date date;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderCode='" + orderCode + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Order(Integer id, String orderCode, Date date) {
        this.id = id;
        this.orderCode = orderCode;
        this.date = date;
    }
}
