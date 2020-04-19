package com.wzf.design.singleton.lazy.simple;

/**
 * @Author: HERO
 * @Date: 2020/3/30 8:46
 * @Version 1.0
 */
public class LazySimpelSingleton {

    private LazySimpelSingleton(){}

    private static LazySimpelSingleton lazySimpelSingleton = null;

    public static LazySimpelSingleton getInstance(){
        if(lazySimpelSingleton == null){
            lazySimpelSingleton = new LazySimpelSingleton();
        }
        return lazySimpelSingleton;
    }

}
