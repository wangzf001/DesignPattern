package com.wzf.design.singleton.lazy.check;

import java.util.concurrent.Callable;

/**
 * @Author: HERO
 * @Date: 2020/3/30 10:06
 * @Version 1.0
 */
public class TestCallable implements Callable<LazyCheckSingleton> {

    public LazyCheckSingleton call() throws Exception {

        LazyCheckSingleton lazyCheckSingleton = LazyCheckSingleton.getIstance();
        System.out.println(Thread.currentThread().getName()+":call:"+lazyCheckSingleton);

        return lazyCheckSingleton;
    }
}
