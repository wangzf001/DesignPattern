package com.wzf.design.strategy.pay;

/**
 * @Author: HERO
 * @Date: 2020/4/12 9:52
 * @Version 1.0
 */
public abstract class Payment {


    //支付类型
    public abstract String getName();

    protected abstract double queryBalance(Integer uid);

    PayState pay(Integer uid,double price){

        if(queryBalance(uid) < price){
            return new PayState(500,"支付类型："+ getName()+"  余额不足！");
        }
        return new PayState(200,"支付类型："+ getName()+"  支付金额："+price);

    }

}
