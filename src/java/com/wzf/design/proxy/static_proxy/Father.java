package com.wzf.design.proxy.static_proxy;

/**
 * @Author: HERO
 * @Date: 2020/4/2 14:49
 * @Version 1.0
 */
public class Father implements IFindLove{

    private Son target;

    public Father(Son son){
        this.target = son;
    }

    public void findLove() {
        System.out.println("前置处理");
        target.findLove();
        System.out.println("后置处理");
    }


}
