package com.wzf.design.prototype.simple;

/**
 * @Author: HERO
 * @Date: 2020/3/31 8:10
 * @Version 1.0
 */
public class Client {

    private IPrototype iPrototype;

    public static IPrototype startClone(IPrototype iPrototype){
        return iPrototype.clone();
    }

    public IPrototype getiPrototype() {
        return iPrototype;
    }

    public void setiPrototype(IPrototype iPrototype) {
        this.iPrototype = iPrototype;
    }
}
