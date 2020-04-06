package com.wzf.design.proxy.cglib_dynamic_proxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @Author: HERO
 * @Date: 2020/4/6 15:30
 * @Version 1.0
 */
public class CgDynamicProxyDemo {

    public static void main(String[] args) {
        //利用cglib的代理类可以将内存中的class文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\proxy\\cglib_dynamic_proxy\\");

        CgCustomer cgCustomer = (CgCustomer) new CgMeiPo().getInstance(CgCustomer.class);
        cgCustomer.findLove();

    }

}
