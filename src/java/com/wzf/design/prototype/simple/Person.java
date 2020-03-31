package com.wzf.design.prototype.simple;

import java.util.List;

/**
 * @Author: HERO
 * @Date: 2020/3/31 8:06
 * @Version 1.0
 */
public class Person implements IPrototype{

    private Integer age;
    private String name;
    private List<String> hobbies;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public IPrototype clone() {
        Person p = new Person();
        p.age = this.age;
        p.name = this.name;
        p.hobbies = this.hobbies;
        return p;
    }
}
