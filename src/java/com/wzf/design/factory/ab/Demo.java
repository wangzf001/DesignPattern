package com.wzf.design.factory.ab;

import com.wzf.design.factory.comm.ICourse;

/**
 * @Author: HERO
 * @Date: 2020/3/29 19:54
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {

        ICourseFactory iCourseFactory = new JavaCourseFactory();
        ICourse iCourse = iCourseFactory.create();
        iCourse.record();

        iCourseFactory.createNote().markDown();
    }

}
