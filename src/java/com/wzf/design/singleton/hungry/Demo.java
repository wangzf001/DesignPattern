package com.wzf.design.singleton.hungry;

import org.springframework.context.ApplicationContext;

/**
 * @Author: HERO
 * @Date: 2020/3/30 8:16
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {

        /*try {
            //静态方法和静态类，同一加载级别，按照加载顺序执行
            Class.forName("com.wzf.design.singleton.hungry.HungrySingleton02");
            HungrySingleton02 hungrySingleton02 = HungrySingleton02.getInstance();
            System.out.println(HungrySingleton02.num);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //
        HungrySingleton hungrySingleton = null;
        hungrySingleton = HungrySingleton.getInstance();

        //静态代码块
        HungrySingleton02 hungrySingleton02 = null;
        hungrySingleton02 = HungrySingleton02.getInstance();


        //案例1   ApplicationContext(); //暂放，等spring源码再理解

    }
}
