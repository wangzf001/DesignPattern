package com.wzf.design.template.course;

/**
 * @Author: HERO
 * @Date: 2020/4/12 14:57
 * @Version 1.0
 */
public abstract class NetworkCourse {

    protected final void creteCourse(String note){
        this.postPreResource();
        this.liveVideo();
        this.postNote(note);

        if(checkNeedHomeWork()){
            homeWork();
        }
    }

    abstract boolean checkNeedHomeWork();

    final void homeWork(){
        System.out.println("课程作业");
    }

    final void postPreResource(){
        System.out.println("预习资料");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void postNote(String note){
        System.out.println("学习笔记："+note);
    }


}
