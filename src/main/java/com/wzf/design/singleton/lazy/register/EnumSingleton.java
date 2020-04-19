package com.wzf.design.singleton.lazy.register;

/**
 * @Author: HERO
 * @Date: 2020/3/30 16:56
 * @Version 1.0
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
