package com.wzf.design.singleton.lazy.syn;

/**
 * @Author: HERO
 * @Date: 2020/3/30 8:46
 * @Version 1.0
 */
public class LazySynSingleton {

    private LazySynSingleton(){}

    private static LazySynSingleton lazySimpelSingleton = null;

    public static synchronized  LazySynSingleton getInstance(){
        if(lazySimpelSingleton == null){
            lazySimpelSingleton = new LazySynSingleton();
        }
        return lazySimpelSingleton;
    }

}
