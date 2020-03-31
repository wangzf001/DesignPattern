package com.wzf.design.factory.comm;

/**
 * @Author: HERO
 * @Date: 2020/3/29 19:49
 * @Version 1.0
 */
public class CourseFactory {

    //可以通过类型传参，如java/python；但不符合开闭原则，传class可以通过反射实现
    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if(clazz != null){
                return clazz.newInstance();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public ICourse create2(String  clazzName){
        try {
            if(clazzName != null && clazzName != ""){
                return (ICourse) Class.forName(clazzName).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
