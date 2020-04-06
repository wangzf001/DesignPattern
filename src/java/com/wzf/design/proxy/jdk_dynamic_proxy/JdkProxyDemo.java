package com.wzf.design.proxy.jdk_dynamic_proxy;

import org.apache.ibatis.ognl.enhance.ContextClassLoader;
import sun.applet.AppletClassLoader;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: HERO
 * @Date: 2020/4/4 15:19
 * @Version 1.0
 */
public class JdkProxyDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.wzf.design.proxy.jdk_dynamic_proxy.JdkCustomer");

            IFindLove iFindLove = (IFindLove) new JdkMeiPo().getInstance(new JdkCustomer());


            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IFindLove.class});
            FileOutputStream fos = new FileOutputStream("D:\\ideaProject\\DesignPattern\\src\\java\\com\\wzf\\design\\proxy\\jdk_dynamic_proxy\\$Proxy0.class");
            fos.write(bytes);
            fos.flush();
            fos.close();

            iFindLove.findLove();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
