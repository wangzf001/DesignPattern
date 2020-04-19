package com.wzf.design.singleton.hungry;

/**
 * @Author: HERO
 * @Date: 2020/3/30 8:35
 * @Version 1.0
 */
public class HungrySingleton02 {

    private HungrySingleton02(){
        System.out.println("HungrySingleton02被加载了");
    }


    public static Integer num = 4;

    static {
        num = 5;
        hungrySingleton = new HungrySingleton02();
    }

    private static HungrySingleton02 hungrySingleton;


    public static HungrySingleton02 getInstance(){
        return hungrySingleton;
    }

}
