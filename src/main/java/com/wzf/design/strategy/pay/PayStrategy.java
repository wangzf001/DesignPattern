package com.wzf.design.strategy.pay;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HERO
 * @Date: 2020/4/12 10:37
 * @Version 1.0
 */
public class PayStrategy {

    public static final String ALIPAY = "ALIPAY";
    public static final String JDPAY = "JDPAY";
    public static final String UNIONPAY = "UNIONPAY";
    public static final String WECHATPAY = "WECHATPAY";
    public static final String DEFAULT = ALIPAY;

    private static Map<String,Payment> map = new HashMap();
    static {
        map.put(ALIPAY,new AliPay());
        map.put(JDPAY,new JDPay());
        map.put(UNIONPAY,new UnionPay());
        map.put(WECHATPAY,new WechatPay());
    }

    public static Payment get(String key){
        Payment payment = map.get(key);
        return payment !=null ? payment:map.get(DEFAULT);
    }

}
