package com.wzf.design.prototype.deep;

import java.io.*;
/**
 * @Author: HERO
 * @Date: 2020/3/31 8:27
 * @Version 1.0
 */
public class QiTianDaSheng extends Monky implements Cloneable ,Serializable{

    private JinGuBang jinGuBang;

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private QiTianDaSheng deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng clone = (QiTianDaSheng) ois.readObject();

            return clone;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public QiTianDaSheng shallowClone(){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setJinGuBang(this.jinGuBang);
        qiTianDaSheng.setBirth(this.getBirth());
        qiTianDaSheng.setHight(this.getHight());

        return qiTianDaSheng;
    }
}
