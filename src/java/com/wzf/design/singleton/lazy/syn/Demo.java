package com.wzf.design.singleton.lazy.syn;

/**
 * @Author: HERO
 * @Date: 2020/3/30 9:57
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();

    }

}
