package com.wzf.design.delegate.simple;

/**
 * @Author: HERO
 * @Date: 2020/4/6 16:32
 * @Version 1.0
 */
public class Boss {

    public void order(Leader leader,String task){
        leader.doing(task);
    }

}
