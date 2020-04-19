package com.wzf.design.proxy.jdk_dynamic_datasource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: HERO
 * @Date: 2020/4/6 8:31
 * @Version 1.0
 */
public class DynamicDataSourceProxy implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(target,args);
        after();
        return  obj;
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    void before(Object arg){
        try {

            Date date =(Date) arg.getClass().getMethod("getDate").invoke(arg);
            DynamicDataSouceEntry.set(sdf.format(date));
            System.out.println("数据库为DB_"+sdf.format(date));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("前置处理");
    }

    void after(){
        System.out.println("后置处理");
    }


}
