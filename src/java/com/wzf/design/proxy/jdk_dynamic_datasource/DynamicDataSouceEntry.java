package com.wzf.design.proxy.jdk_dynamic_datasource;

/**
 * @Author: HERO
 * @Date: 2020/4/6 8:20
 * @Version 1.0
 */
public class DynamicDataSouceEntry {

    private static final String  DEFAULT_DATASOURCE = "DEFAULT_DATASOURCE";

    private static final ThreadLocal<String> dataSource = new ThreadLocal<>();

    public static void get(String name){
        dataSource.get();
    }

    public static void set(String name){
        dataSource.set(name);
    }

    public static void set(Integer year){
        dataSource.set("DB"+year);
    }

    public static void reset(){
        dataSource.remove();
    }


}
