package com.wzf.design.singleton.hungry;

/**
 * @Author: HERO
 * @Date: 2020/3/30 8:14
 * @Version 1.0
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        System.out.println("HungrySingleton被加载了");
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
