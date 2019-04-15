package com.gupaoedu.vip.pattern.prototype.deep;

public class DeepCloneTest {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng deepCopy = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("原齐天大圣的金箍棒：" + qiTianDaSheng.getJingGuBang());
            System.out.println("深克隆的齐天大圣的金箍棒：" + deepCopy.getJingGuBang());
            System.out.println("深克隆：" + (qiTianDaSheng.getJingGuBang() == deepCopy.getJingGuBang()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng shallowCopy = qiTianDaSheng.shallowClone(qiTianDaSheng);
        System.out.println("原齐天大圣的金箍棒：" + qiTianDaSheng.getJingGuBang());
        System.out.println("浅克隆的齐天大圣的金箍棒：" + shallowCopy.getJingGuBang());
        System.out.println("浅克隆：" + (qiTianDaSheng.getJingGuBang() == shallowCopy.getJingGuBang()));



    }
}
