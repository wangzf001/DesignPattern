package com.wzf.design.factory.simple;

import com.wzf.design.factory.comm.CourseFactory;
import com.wzf.design.factory.comm.ICourse;
import com.wzf.design.factory.comm.JavaCourse;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * @Author: HERO
 * @Date: 2020/3/29 19:54
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        CourseFactory cf = new CourseFactory();

        ICourse iCourse = cf.create(JavaCourse.class);
        iCourse.record();

        cf.create2("com.wzf.design.factory.simple.JavaCourse");

        //JDK中案例1
        Calendar.getInstance();

        //案例2
        LoggerFactory.getLogger(CourseFactory.class);
    }

}
