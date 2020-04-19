package com.wzf.design.singleton.lazy.check;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author: HERO
 * @Date: 2020/3/30 10:20
 * @Version 1.0
 */
public class Demo {


    public static void main(String[] args) {

        TestCallable callable = new TestCallable();
        FutureTask futureTask = new FutureTask<LazyCheckSingleton>(callable);
        Thread t1 = new Thread(futureTask);
        t1.start();

        FutureTask futureTask2 = new FutureTask<LazyCheckSingleton>(callable);
        Thread t2 = new Thread(futureTask2);
        t2.start();

        try {
            if (futureTask.get() != null) {
                System.out.println("返回结果" + futureTask.get());
            } else {
                System.out.println("未返回结果"+futureTask.get());
            }

            if (futureTask2.get() != null) {
                System.out.println("返回结果" + futureTask2.get());
            } else {
                System.out.println("未返回结果"+futureTask2.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
