package com.my.designpattern.structures.proxy.jdkproxy;

/**
 * @Author huruipeng
 * @Description JDK动态代理也是代理的接口
 * @Date 2019/7/3 15:39
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        Specialty wySpecialty = new WySpecialty();
        Specialty wySpecialty1 = (Specialty) new JdkWySpecialtyProxy().newProxy(wySpecialty);
        wySpecialty1.show();

        Specialty cxSpecialty = new CxSpecialty();
        Specialty specialty = (Specialty) new JdkWySpecialtyProxy().newProxy(cxSpecialty);
        specialty.show();

    }
}
