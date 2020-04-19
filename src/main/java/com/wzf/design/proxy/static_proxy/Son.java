package com.wzf.design.proxy.static_proxy;

/**
 * @Author: HERO
 * @Date: 2020/4/2 14:50
 * @Version 1.0
 */
public class Son implements IFindLove {
    @Override
    public void findLove() {
        System.out.println("须是倾国倾城之人");
    }
}
