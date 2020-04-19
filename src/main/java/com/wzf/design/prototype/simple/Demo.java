package com.wzf.design.prototype.simple;

import java.util.ArrayList;
/**
 * @Author: HERO
 * @Date: 2020/3/31 8:05
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("wzf");
        person.setHobbies(new ArrayList<String>());

        Person newObj = (Person)Client.startClone(person);
        System.out.println("person"+person);
        System.out.println("newObj"+newObj);
        //只拷贝了对象的引用地址
        System.out.println(person.getHobbies() == newObj.getHobbies());

    }
}
