package com.wzf.design.delegate.simple;

/**
 * @Author: HERO
 * @Date: 2020/4/6 16:33
 * @Version 1.0
 */
public class EmployeeB implements IEmployee{

    public void doing(String command) {
        System.out.println("我是员工B，我开始做"+command);
    }
}
