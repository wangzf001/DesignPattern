package com.wzf.design.singleton.lazy.simple;

import com.wzf.design.singleton.lazy.simple.LazySimpelSingleton;

/**
 * @Author: HERO
 * @Date: 2020/3/30 9:35
 * @Version 1.0
 */
public class ExecutorThread implements Runnable {
    public void run() {
        LazySimpelSingleton lazySimpelSingleton = LazySimpelSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpelSingleton);
    }
}
