package com.my.designpattern.structures.proxy;

/**
 * @Author huruipeng
 * @Description 静态代理，比较简单
 * @Date 2019/7/3 14:19
 * @Param
 * @creator huruipeng
 * @return
 **/
public class WySpecialtyProxy implements Specialty {
    private Specialty wySpecialty;

    public WySpecialtyProxy(Specialty specialty) {
        this.wySpecialty = specialty;
    }

    public static void main(String[] args) {
        WySpecialty wySpecialty = new WySpecialty();
        Specialty sp = new WySpecialtyProxy(wySpecialty);
        sp.show();
    }

    @Override
    public void show() {
        doBefore();
        wySpecialty.show();
        doAfter();
    }

    private void doBefore() {
        System.out.println("代理预处理");
    }

    private void doAfter() {
        System.out.println("代理后置处理");
    }
}
