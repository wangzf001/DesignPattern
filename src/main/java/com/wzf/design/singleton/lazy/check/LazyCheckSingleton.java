package com.wzf.design.singleton.lazy.check;

/**
 * @Author: HERO
 * @Date: 2020/3/30 10:06
 * @Version 1.0
 */
public class LazyCheckSingleton {

    private LazyCheckSingleton(){}

    static Integer num = 4;

    private static LazyCheckSingleton lazyCheckSingleton;

    public static LazyCheckSingleton getIstance(){
        if(lazyCheckSingleton == null){
            synchronized (LazyCheckSingleton.class){
                if(lazyCheckSingleton == null){
                    lazyCheckSingleton = new LazyCheckSingleton();
                }
            }
        }
        return lazyCheckSingleton;
    }

}
