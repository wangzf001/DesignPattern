package com.wzf.design.strategy.promotion;

/**
 * @Author: HERO
 * @Date: 2020/4/8 16:47
 * @Version 1.0
 */
public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现金促销");
    }
}
