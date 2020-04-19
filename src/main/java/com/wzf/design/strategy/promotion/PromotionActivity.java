package com.wzf.design.strategy.promotion;

/**
 * @Author: HERO
 * @Date: 2020/4/8 16:50
 * @Version 1.0
 */
public class PromotionActivity {

    IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    void excute(){
        this.strategy.doPromotion();
    }
}
