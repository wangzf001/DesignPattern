package com.wzf.design.proxy.static_proxy;

/**
 * @Author: HERO
 * @Date: 2020/4/2 14:59
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        Father proxy = new Father(new Son());
        proxy.findLove();
    }
}
