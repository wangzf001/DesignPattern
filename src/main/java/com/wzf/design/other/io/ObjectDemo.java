package com.wzf.design.other.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author: HERO
 * @Date: 2020/4/1 10:38
 * @Version 1.0
 */
public class ObjectDemo {

    static final String TO_FILE_PATH = "D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\other\\io\\TheUser.class";

    public static void main(String[] args) {

        //ObjectOutputStream ObjectInputStream
        method1();

        //

    }

    static void method1(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            User user = new User(18,new ArrayList<String>(),"wzf");
            os = new FileOutputStream(TO_FILE_PATH);
            oos = new ObjectOutputStream(os);

            oos.writeObject(user);

            is = new FileInputStream(TO_FILE_PATH);
            ois = new ObjectInputStream(is);
            User readUser = (User) ois.readObject();
            System.out.println(readUser);

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
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


/**
 * 非public修饰的类，子类/同包/内部 可访问
 */
class User implements Serializable {
    // 显示申明 是根据类名 字段 参数 生成的一个64位的hash值(申明之后就不会变了 就算修改了类信息)
    // 隐式申明 也是会根据类名 字段 参数 生成的一个64位的hash值(但是每次类信息修改 都会重新生成)
    private static final long serialVersionUID = 4768385263486448636L;
    private Integer age;
    private List<String> hobbies;
    private String name;

    public User(){

    }

    public User(Integer age,List<String> hobbies,String name){
        this.age = age;
        this.hobbies = hobbies;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", hobbies=" + hobbies +
                ", name='" + name + '\'' +
                '}';
    }
}