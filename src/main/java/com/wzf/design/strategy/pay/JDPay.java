package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 10:07
 * @Version 1.0
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    protected double queryBalance(Integer uid) {
        return 400;
    }
}
