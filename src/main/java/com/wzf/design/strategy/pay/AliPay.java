package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 10:05
 * @Version 1.0
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(Integer uid) {
        return 500;
    }
}
