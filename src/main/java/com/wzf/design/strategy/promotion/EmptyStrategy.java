package com.wzf.design.strategy.promotion;

/**
 * @Author: HERO
 * @Date: 2020/4/8 16:49
 * @Version 1.0
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("原价，没有促销");
    }
}
