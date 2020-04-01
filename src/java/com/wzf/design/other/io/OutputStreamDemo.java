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
            String TO_FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\osTest2.txt";
            String str = "I am hero.";

            //1,write(b);写入数组
            OutputStream os = new FileOutputStream(new File(FILE_PATH));
            os.write(str.getBytes());

            //2，new FileOutputStream(new File("path"),true); 追加内容
            String z = "追加的内容";
            os = new FileOutputStream(new File(FILE_PATH), true);
            os.write(z.getBytes());

            //inputStream和outputSteam联合使用
            copyTxt(FILE_PATH,TO_FILE_PATH);

            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void copyTxt(String FILE_PATH, String TO_FILE_PATH) {

        try {
            InputStream is = new FileInputStream(new File(FILE_PATH));
            OutputStream os = new FileOutputStream(new File(TO_FILE_PATH));

            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                os.write(bytes,0,len);
            }

            os.flush();
            os.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
