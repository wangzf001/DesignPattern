package com.wzf.design.other.io;

import java.io.*;

/**
 * @Author: HERO
 * @Date: 2020/3/31 11:05
 * @Version 1.0
 */
public class InputStreamDemo {

    public static void main(String[] args) {

        try {
            String FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\test.txt";
            InputStream is = new FileInputStream(new File(FILE_PATH));
            System.out.println(is.read());
            int len;
            /*
            //1,is.read();每次读取一个字节
            while ((len = is.read())!= -1){
                System.out.println((char) len);
            }*/

            /*
            //2，is.read(bytes)；每次读取一个数组，返回值为读入的字节数
            byte[] bytes = new byte[10];
            while ((len = is.read(bytes))!= -1){
                System.out.println("长度："+len);
                for (int i = 0; i < bytes.length; i++) {
                    System.out.println((char)bytes[i]);
                }
            }*/

           /*
           //3,is.available()；返回所有字节数
            byte[] bytes = new byte[is.available()];
            is.read(bytes);
            System.out.println(new String(bytes));
            */

           /*
           //4,is.read(bytes,4,5); 指定位置读取
            byte[] bytes = new byte[10];
            is.read(bytes,4,5);
            System.out.println(new String(bytes));
            */

           /*
            //5，结合StringBuilder，发现问题：当最后一次不满时，则0 ~ len-1读取，len之后的内容是上次的bytes数据。
            // 官方解释：将读取的第一个字节存储在元素 b[0] 中，下一个存储在 b[1] 中，依次类推。读取的字节数最多等于 b 的长度。设 k 为实际读取的字节数；这些字节将存储在 b[0] 到 b[k-1] 的元素中，不影响 b[k] 到 b[b.length-1] 的元素。
            byte[] bytes = new byte[8];
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(bytes)) != -1){
                System.out.println("长度"+len);
                String str = new String(bytes);
                System.out.println("str:"+str);
                sb.append(str);
            }
            System.out.println("长度end:"+len);
            System.out.println(sb);
            */

            //6，结合StringBuilder，解决问题。
            byte[] bytes = new byte[8];
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(bytes)) != -1){
                String str = new String(bytes);
                str = str.substring(0,len);
                sb.append(str);
            }
            System.out.println(sb);

            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
