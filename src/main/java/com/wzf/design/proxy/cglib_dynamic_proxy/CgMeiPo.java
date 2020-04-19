package com.wzf.design.proxy.cglib_dynamic_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: HERO
 * @Date: 2020/4/6 15:13
 * @Version 1.0
 */
public class CgMeiPo implements MethodInterceptor {

    public Object getInstance(Class clazz){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object obj = methodProxy.invokeSuper(o,objects);
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
