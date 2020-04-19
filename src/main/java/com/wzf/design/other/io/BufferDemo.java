package com.wzf.design.other.io;

import java.io.*;

/**
 * @Author: HERO
 * @Date: 2020/3/31 16:48
 * @Version 1.0
 */
public class BufferDemo {

    private static final String FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\test.txt";
    private static final String TO_FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\writerTest.txt";


    public static void main(String[] args) {

        //InputStreamBuffer
//        method1();

        //BufferedInputStream BufferedOutputStream
//        method2();

        //BufferedReader BufferedWriter InputStreamReader
//        method3();

        //try-with-resource 语法糖，自动关闭实现Closeable的类
         method4();
    }


    static void method4() {
        try (
                InputStream is = new FileInputStream(new File(FILE_PATH));
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                OutputStream os = new FileOutputStream(new File(TO_FILE_PATH));
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
        ){
            int len;
            char[] chars = new char[1024];
            while ((len = br.read(chars)) != -1) {
                bw.write(chars,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }


    static void method3() {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            int len;
            is = new FileInputStream(new File(FILE_PATH));
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            os = new FileOutputStream(new File(TO_FILE_PATH));
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            char[] chars = new char[1024];
            while ((len = br.read(chars)) != -1) {
                bw.write(chars,0,len);
                bw.newLine();
//                br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null){
                try {
                    bw.flush();
                    bw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            /*if(osw != null){ //只关闭处理流即可，不然报错java.io.IOException: Stream closed
                try {
                    osw.flush();
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os != null){
                try {
                    os.flush();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/
            if(is != null){
                try {
                    br.close();
//                    isr.close();
//                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void method2() {
        BufferedInputStream bis = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedOutputStream bos = null;
        try {
            int len;
            is = new FileInputStream(new File(FILE_PATH));
            bis = new BufferedInputStream(is);
            os = new FileOutputStream(new File(TO_FILE_PATH));
            bos = new BufferedOutputStream(os);
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null){
                try {
                    bos.flush();
                    bos.close();
                    os.flush();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null){
                try {
                    bis.close();
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void method1() {
        BufferedInputStream bis = null;
        InputStream is = null;
        try {
            int len;
            is = new FileInputStream(new File(FILE_PATH));
            bis = new BufferedInputStream(is);
            byte[] bytes = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while ((len = bis.read(bytes)) != -1) {
                String str = new String(bytes);
                str.substring(0, len);
                sb.append(str);
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
