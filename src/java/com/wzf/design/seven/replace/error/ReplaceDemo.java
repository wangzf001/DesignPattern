package com.wzf.design.seven.replace.error;

import com.wzf.design.seven.replace.error.JavaCourse;

/**
 * @Author: HERO
 * @Date: 2020/3/19 16:07
 * @Version 1.0
 */
public class ReplaceDemo {

    //里氏替换原则
    public static void main(String[] args) {
        Course course = new Course();

        JavaCourse javaCourse = new JavaCourse();

        //1
        say(course);
        //2
        say(javaCourse);
        //1和2的执行接口不一致，违反了里氏替换原则
    }

    static void say(Course course){
        course.start();
    }
}
