package com.wzf.design.proxy.jdk_dynamic_proxy;

/**
 * @Author: HERO
 * @Date: 2020/4/4 15:18
 * @Version 1.0
 */
public class JdkCustomer implements IFindLove {

    @Override
    public void findLove() {
        System.out.println("客户要求：肤白貌美大长腿");
    }
}
