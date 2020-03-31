package com.wzf.design.prototype.deep;

import java.io.Serializable;

/**
 * @Author: HERO
 * @Date: 2020/3/31 8:26
 * @Version 1.0
 */
public class JinGuBang implements Serializable {

    private Integer length;

    void big(){
        this.length *= 2;
    }

    void small(){
        this.length /=2 ;
    }

}
