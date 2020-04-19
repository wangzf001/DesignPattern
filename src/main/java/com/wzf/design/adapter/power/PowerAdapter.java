package com.wzf.design.adapter.power;

/**
 * @Author: HERO
 * @Date: 2020/4/13 10:48
 * @Version 1.0
 */
public class PowerAdapter extends DC5{

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入的是"+adapterInput+"V，输出的是"+adapterOutput+"V");
        return adapterOutput;
    }



}
