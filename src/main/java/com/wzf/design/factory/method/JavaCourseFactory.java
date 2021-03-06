package com.wzf.design.factory.method;

import com.wzf.design.factory.comm.ICourse;
import com.wzf.design.factory.comm.JavaCourse;

/**
 * @Author: HERO
 * @Date: 2020/3/29 19:49
 * @Version 1.0
 */
public class JavaCourseFactory implements ICourseFactory {

    public ICourse create(){
        try {
            return new JavaCourse();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
