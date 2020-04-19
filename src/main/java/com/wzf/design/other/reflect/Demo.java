package com.wzf.design.other.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: HERO
 * @Date: 2020/4/3 21:16
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * (1)类的Class对象产生：在类加载时，由JVM自动产生；
         * (2)一个类只加载一次：一个类在内存里只对应一个Class对象；
         * (3)Class类没有公共的构造方法；
         */
        try {
            //获取class的办法
            Class clazz = OldMan.class;

            OldMan oldMan= (OldMan) clazz.newInstance();

            Class clazz2 = oldMan.getClass();

            Class forNameClazz = Class.forName("com.wzf.design.other.reflect.OldMan");

            Class personClazz = clazz.getSuperclass();
            System.out.println("全路径:"+personClazz.getName());
            System.out.println("类名:"+personClazz.getSimpleName());
            System.out.println("是否时接口:"+personClazz.isInterface());
            System.out.println("实例对象:"+personClazz.newInstance());
            System.out.println("public的属性:"+personClazz.getFields());
            System.out.println("全部属性:"+personClazz.getDeclaredFields());
            System.out.println("根据属性名获取属性:"+personClazz.getDeclaredField("age"));
//            System.out.println("根据属性名获取public属性:"+personClazz.getField("age"));
            System.out.println("通过私有构造方法实例对象:"+personClazz.getConstructor().newInstance());
            System.out.println("类的接口:"+personClazz.getInterfaces());

            Class integerClazz = Integer.TYPE;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
