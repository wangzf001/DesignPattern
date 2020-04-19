package com.wzf.design.proxy.static_datasource;

import java.util.Date;

/**
 * @Author: HERO
 * @Date: 2020/4/2 15:13
 * @Version 1.0
 */
public class Order {

    private Integer id;
    private String orderCode;
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderCode='" + orderCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
