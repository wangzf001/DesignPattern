package com.wzf.design.adapter.power;

/**
 * @Author: HERO
 * @Date: 2020/4/13 11:01
 * @Version 1.0
 */
public class PowerDamo {

    public static void main(String[] args) {

        DC5 adpter = new PowerAdapter(new AC220());
        adpter.outputDC5();

    }
}
