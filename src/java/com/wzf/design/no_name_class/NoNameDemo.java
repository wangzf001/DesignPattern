package com.wzf.design.no_name_class;

/**
 * @Author: HERO
 * @Date: 2020/4/6 11:02
 * @Version 1.0
 */
public class NoNameDemo {

    public static void main(String[] args) {

        //第一种 实现接口
        ISay iSay = new ISay(){
            @Override
            public void say() {
                System.out.println("我是通过接口实现的匿名类");
            }
        };
        iSay.say();

        //第二种
        Person person = new Person(){
            @Override
            public void say() {
                super.say();
                System.out.println("我相当于Person的子类，匿名类");
            }
        };
        person.say();


    }

}
