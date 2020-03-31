package com.wzf.design.singleton.lazy.inner;

/**
 * @Author: HERO
 * @Date: 2020/3/30 11:08
 * @Version 1.0
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton (){}

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

}
