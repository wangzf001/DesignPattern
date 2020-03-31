package com.wzf.design.singleton.lazy.brack;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: HERO
 * @Date: 2020/3/30 11:17
 * @Version 1.0
 */
public class SerializableBreakDemo {

    public static void main(String[] args) {

        /**
         * 通过序列号破坏单例
         */
        try {
            //通过在 LazyInnerClassSingleton 中增加readResolve()方法防止序列化破坏
            LazyInnerClassSingleton o = LazyInnerClassSingleton.getInstance();
            FileOutputStream fos = new FileOutputStream("LazyInnerClassSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();

            FileInputStream fis = new FileInputStream("LazyInnerClassSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LazyInnerClassSingleton o2 = (LazyInnerClassSingleton) ois.readObject();
            ois.close();

            System.out.println(o);
            System.out.println(o2);
            System.out.println(o == o2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
