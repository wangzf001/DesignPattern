package com.wzf.design.template.course;

/**
 * @Author: HERO
 * @Date: 2020/4/12 15:04
 * @Version 1.0
 */
public class CourseDemo {


    public static void main(String[] args) {
        new JavaCourse().creteCourse("Java笔记");
        System.out.println("===============");
        new BigDataCourse().creteCourse("大数据笔记");

    }

}
