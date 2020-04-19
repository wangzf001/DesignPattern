package com.wzf.design.other.io;

import java.io.*;

/**
 * @Author: HERO
 * @Date: 2020/3/31 15:42
 * @Version 1.0
 */
public class ReaderDemo {

    public static void main(String[] args) {
        String FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\test.txt";
        String TO_FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\writerTest.txt";
        try {

            InputStream is = new FileInputStream(new File(FILE_PATH));
            int len;

            InputStreamReader isr = new InputStreamReader(is);
            //1,reader.read();
//            method1(isr);

            //2,reder.read(chars);
//            method2(isr);

            //3,isr.read(chars1,0,5);
//            method3(isr);

            //4,FileReader  FileWriter
//            method4( FILE_PATH, TO_FILE_PATH);

            //5，InputStreamReader,InputStreamWriter
            method5( FILE_PATH, TO_FILE_PATH);

            isr.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void method1(InputStreamReader isr){
        try {
            System.out.println((char)isr.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void method2(InputStreamReader isr){
        try {
            int len;
            char[] chars = new char[8];
            StringBuffer sb = new StringBuffer();
            while ((len = isr.read(chars)) != -1){
                sb.append(new String(chars).substring(0,len));
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void method3(InputStreamReader isr){
        try {
            char[] chars1 = {'英','雄'};
            isr.read(chars1,0,1);
            System.out.println(chars1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void method4(String FILE_PATH,String TO_FILE_PATH) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(new File(FILE_PATH));
            fileWriter = new FileWriter(new File(TO_FILE_PATH));
            char[] chars = new char[1024];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void method5(String FILE_PATH,String TO_FILE_PATH){
        InputStream is = null;
        InputStreamReader isr = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;
        try {
            is = new FileInputStream(new File(FILE_PATH));
            os = new FileOutputStream(new File(TO_FILE_PATH));
            isr = new InputStreamReader(is);
            osw = new OutputStreamWriter(os);
            char[] chars = new char[1024];
            int len;
            while ((len = isr.read(chars)) != -1 ){
                osw.write(chars,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null){
                try {
                    isr.close();
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os != null){
                try {
                    osw.flush();
                    osw.close();
                    os.flush();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
