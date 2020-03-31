package com.wzf.design.singleton.lazy.brack;

import java.io.Serializable;

/**
 * @Author: HERO
 * @Date: 2020/3/30 11:08
 * @Version 1.0
 */
public class LazyInnerClassSingleton implements Serializable {
    private LazyInnerClassSingleton(){
        if(Lazy.LAZY != null){
            throw new RuntimeException("不可重复创建实例");
        }
    }

    /**
     * final修饰方法，不可继承、不可重写
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        return Lazy.LAZY;
    }

    /**
     * 默认不加载
     */
    private static class Lazy{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    /**
     * 防止序列化破坏单例
     * @return
     */
    private Object readResolve(){
        return Lazy.LAZY;
    }

}
