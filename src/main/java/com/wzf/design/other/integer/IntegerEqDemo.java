package com.wzf.design.other.integer;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: HERO
 * @Date: 2020/4/12 8:27
 * @Version 1.0
 */
public class IntegerEqDemo {

    public static void main(String[] args) {
        //装箱
        Integer t1 = 100;//其实相当于Integer.valueOf(100);

        //拆箱
        int t2 = t1; //其实相当于 t1.intValue();

        //难点：通过反编译class文件就可以看到。
        // 1，  Integer的valueOf中判断，若值-128~127，则返回内部类中IntegerCache已经实例的对象(单例)，
        //      反之，则重新new Integer()生成新的对象;
        // 2，  Integer和int比较时，自动拆箱。

        Integer a1 = 100;
        Integer a2 = 100;
        Integer b1 = 128;
        Integer b2 = 128;
        Integer a3 = new Integer(100);
        Integer a4 = Integer.valueOf(100);
        Integer a5 = new Integer(2000);
        Integer a7 = null;
        int a6 = 2000 ;


        System.out.println("1、"+ (a1 == a2));//true 自动装箱 调用了valueOf方法，值在-128~127之间，所有指向同一对象；
        System.out.println("2、"+ (b1 == b2));//false 自动装箱 调用了valueOf方法，值不在-128~127之间，通过newInteger()重新实例了，不指向同一对象；
        System.out.println("3、"+ (a1 == a3));//false 因为a3自己重新实例的对象，所以地址指向不一致。
        System.out.println("4、"+ (a1 == a4));//true a1和a4 是一样的，a1默认装箱，调用Integer.valueOf(100)，因为值在-128~127之间，所有指向同一对象；
        System.out.println("5、"+ (a5 == a6));//true 两者比较时自动拆箱，a5调用了a5.intValue(),所以两者数值大小相等。

        System.out.println("6、"+ (b1.equals(b2)));//true
        System.out.println("7、"+ (b1.intValue() == b2.intValue()));//true
//        System.out.println("8、"+ (a7 == 2));//异常 调用a7.intValue()时空指针


        //所以一般涉及到Integer的比较
        //1,保证不为空
        //2,用Intger对象的equals方法比较，这样比较的是值，而不是引用地址
        System.out.println("9、"+ (b1 != null && b1.equals(b2)));
        System.out.println("10、"+ (b1 != null && b1.equals(128)));

    }

}
