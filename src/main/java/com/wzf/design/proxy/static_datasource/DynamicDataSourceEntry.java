package com.wzf.design.proxy.static_datasource;

/**
 * @Author: HERO
 * @Date: 2020/4/2 15:17
 * @Version 1.0
 */
public class DynamicDataSourceEntry {

    public static final String DEFAULT = null;

    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    public static void set(String source){
        local.set(source);
    }

    public static void set(Integer year){
        local.set("DB"+year);
    }

    public static void get(){
        local.get();
    }

    public static void restore(){
        local.remove();
    }




}
