package com.wzf.design.other.io;

import java.io.*;

/**
 * @Author: HERO
 * @Date: 2020/3/31 14:50
 * @Version 1.0
 */
public class OutputStreamDemo {

    public static void main(String[] args) {

        try {
            String FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\osTest.txt";
            String str = "I am hero.";

            //1,write(b);写入数组
            OutputStream os = new FileOutputStream(new File(FILE_PATH));
            os.write(str.getBytes());

            //2，new FileOutputStream(new File("path"),true); 追加内容
            String z = "追加的内容";
            os = new FileOutputStream(new File(FILE_PATH),true);
            os.write(z.getBytes());

            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
