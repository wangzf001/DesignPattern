package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 9:50
 * @Version 1.0
 * 返回对象
 */
public class PayState {

    private Integer code;
    private String msg;

    public PayState() {
    }

    public PayState(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
