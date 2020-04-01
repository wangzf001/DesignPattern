package com.wzf.design.other.io;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: HERO
 * @Date: 2020/4/1 15:55
 * @Version 1.0
 */
public class ByteArrayDemo {
    private static final String TO_FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\obj.txt";

    public static void main(String[] args) {

        //ByteArrayOutputStream  ByteArrayInputStream
//        method();

        //测试 serializable实现类中的serialVersionUID作用
//        writeObject();
        readObject();

    }

    static void writeObject(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            User user = new User(18,new ArrayList<String>(),"wzf");

            os = new FileOutputStream(TO_FILE_PATH);
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                oos.flush();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.flush();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void readObject(){
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(TO_FILE_PATH);
            ois = new ObjectInputStream(is);
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    static void method(){
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            User user = new User(18,new ArrayList<String>(),"wzf");

            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(user);

            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            User clone = (User) ois.readObject();

            System.out.println("原型模式-深克隆:"+(user == clone));

            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
               ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bais.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.flush();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                baos.flush();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
