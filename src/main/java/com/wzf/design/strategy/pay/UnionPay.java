package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 10:06
 * @Version 1.0
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    protected double queryBalance(Integer uid) {
        return 50;
    }
}
