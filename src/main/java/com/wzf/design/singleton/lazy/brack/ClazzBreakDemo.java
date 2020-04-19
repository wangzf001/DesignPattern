package com.wzf.design.singleton.lazy.brack;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: HERO
 * @Date: 2020/3/30 11:17
 * @Version 1.0
 */
public class ClazzBreakDemo {

    public static void main(String[] args) {

        /**
         * 通过反射破坏单例
         */
        /*Class clazz = LazyCheckSingleton.class;
        try {
            //通过反射拿到私有构造方法
            Constructor constructor = clazz.getDeclaredConstructor(null);
            //强制访问
            constructor.setAccessible(true);
            Object o = constructor.newInstance();

            LazyCheckSingleton instanceOne = LazyCheckSingleton.getIstance();

            System.out.println("是否为同一实例："+instanceOne == o);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/


        try {
            Class clazz = LazyInnerClassSingleton.class;

            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object o = constructor.newInstance();

            LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();
            System.out.println("是否同一对象："+ (o == o2));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
