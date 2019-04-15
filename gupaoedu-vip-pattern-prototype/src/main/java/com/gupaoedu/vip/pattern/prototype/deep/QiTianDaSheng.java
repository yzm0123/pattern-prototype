package com.gupaoedu.vip.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    private JingGuBang jingGuBang;

    public QiTianDaSheng() {
        this.jingGuBang = new JingGuBang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆方法
     * @return
     */
    private Object deepClone() {
        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copyQiTianDaSheng = (QiTianDaSheng) ois.readObject();
            copyQiTianDaSheng.setBirthday(new Date());

            ois.close();
            bis.close();
            oos.close();
            bos.close();

            return copyQiTianDaSheng;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 浅克隆
     * @param target
     * @return
     */
    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng copyQiTianDaSheng = new QiTianDaSheng();
        copyQiTianDaSheng.setHight(target.hight);
        copyQiTianDaSheng.setWeight(target.weight);
        copyQiTianDaSheng.setJingGuBang(target.jingGuBang);
        copyQiTianDaSheng.setBirthday(new Date());

        return copyQiTianDaSheng;
    }

    public JingGuBang getJingGuBang() {
        return jingGuBang;
    }

    public void setJingGuBang(JingGuBang jingGuBang) {
        this.jingGuBang = jingGuBang;
    }
}
