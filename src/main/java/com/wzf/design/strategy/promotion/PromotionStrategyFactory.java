package com.wzf.design.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HERO
 * @Date: 2020/4/8 17:19
 * @Version 1.0
 */
public class PromotionStrategyFactory {

    private static Map<String,IPromotionStrategy> map = new HashMap<String,IPromotionStrategy>();
    static {
        map.put(PromotionKey.COUPON,new CouponStrategy());
        map.put(PromotionKey.CASHBACK,new CashBackStrategy());
        map.put(PromotionKey.GROUPBY,new GroupByStrategy());
        map.put(PromotionKey.EMPTY,new EmptyStrategy());
    }

    private static final IPromotionStrategy empty = new EmptyStrategy();

    public static IPromotionStrategy getPromotionStrategy(String key){
        IPromotionStrategy strategy = map.get(key);
        return strategy == null ? empty : strategy;
    }






    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBY = "GROUPBY";
        String EMPTY = "EMPTY";
    }


}
