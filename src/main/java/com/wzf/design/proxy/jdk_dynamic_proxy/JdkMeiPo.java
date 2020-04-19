package com.wzf.design.proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: HERO
 * @Date: 2020/4/4 15:18
 * @Version 1.0
 */
public class JdkMeiPo implements InvocationHandler {

    private Object trarget;

    public Object getInstance(Object obj){
        this.trarget = obj;
        Class clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object obj = method.invoke(this.trarget,args);
        after();

        return obj;
    }


    void before(){
        System.out.println("前置处理");
    }

    void after(){
        System.out.println("后置处理");
    }
}
