package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 10:43
 * @Version 1.0
 */
public class PayDemo {

    public static void main(String[] args) {


        Order order = new Order(1,"dfdf",600);
        PayState state = order.pay(PayStrategy.WECHATPAY);
        System.out.println(state);

    }

}
