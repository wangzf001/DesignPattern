package com.wzf.design.prototype.deep;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: HERO
 * @Date: 2020/3/31 8:38
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        try {
            QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
            qiTianDaSheng.setJinGuBang(new JinGuBang());
            qiTianDaSheng.setBirth(new Date());

            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(clone);
            System.out.println(qiTianDaSheng);
            System.out.println(clone.getJinGuBang() == qiTianDaSheng.getJinGuBang());

            //BeanUtil实现浅克隆
            QiTianDaSheng clone2 = new QiTianDaSheng();
            BeanUtils.copyProperties(clone2,qiTianDaSheng);
            System.out.println(clone2.getJinGuBang() == qiTianDaSheng.getJinGuBang());

            //ArrayList的克隆
            new ArrayList<String>().clone();



        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
