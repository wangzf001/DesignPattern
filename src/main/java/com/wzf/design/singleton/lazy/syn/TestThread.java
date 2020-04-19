package com.wzf.design.singleton.lazy.syn;

/**
 * @Author: HERO
 * @Date: 2020/3/30 9:55
 * @Version 1.0
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        LazySynSingleton lazySynSingleton = LazySynSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySynSingleton);
    }
}
