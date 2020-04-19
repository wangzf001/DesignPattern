package com.wzf.design.singleton.lazy.simple;

import com.wzf.design.singleton.lazy.simple.ExecutorThread;

/**
 * @Author: HERO
 * @Date: 2020/3/30 8:49
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {

        ExecutorThread executorThread = new ExecutorThread();
        Thread t1 = new Thread(executorThread);
        Thread t2 = new Thread(executorThread);
        t1.start();
        t2.start();

    }

}
