package com.wzf.design.delegate.simple;

/**
 * @Author: HERO
 * @Date: 2020/4/6 16:33
 * @Version 1.0
 */
public class DelegateDemo {

    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.order(new Leader(),"架构");
    }

}
