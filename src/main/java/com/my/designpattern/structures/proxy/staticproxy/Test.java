package com.my.designpattern.structures.proxy.staticproxy;

/**
 * @Author huruipeng
 * @Description 静态代理比较简单，只能代理靠接口实现的类
 * @Date 2019/7/3 14:23
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        WySpecialty wySpecialty = new WySpecialty();
        Specialty sp = new WySpecialtyProxy(wySpecialty);
        sp.show();
    }

}
