package com.wzf.design.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: HERO
 * @Date: 2020/4/8 16:51
 * @Version 1.0
 */
public class StrategyDemo {

    public static void main(String[] args) {

        PromotionActivity activity = null;

        String promotionKey = "COUPON";

//        if(StringUtils.equals(promotionKey,"COUPON")){
//            activity = new PromotionActivity(new CouponStrategy());
//        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
//            activity = new PromotionActivity(new CashBackStrategy());
//        }else if(StringUtils.equals(promotionKey,"GROUPBY")){
//            activity = new PromotionActivity(new GroupByStrategy());
//        }

        activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));

        activity.excute();

    }

}
