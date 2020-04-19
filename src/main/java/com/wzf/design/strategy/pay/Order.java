package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 10:46
 * @Version 1.0
 */
public class Order {

    private Integer uid;
    private String orderId;
    private double amount;

    public Order(Integer uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(){
        return pay(PayStrategy.DEFAULT);
    }

    public PayState pay(String key){
        Payment payment = PayStrategy.get(key);
        System.out.println("欢迎使用："+ payment.getName());
        return payment.pay(uid,amount);
    }
}
