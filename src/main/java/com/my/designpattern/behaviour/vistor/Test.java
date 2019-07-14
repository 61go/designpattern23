package com.my.designpattern.behaviour.vistor;

/**
 * @program: Test
 * @description:访问者模式
 * @author: Caffeine61
 * @create: 2019-07-15 04:19
 **/


public class Test {
    public static void main(String[] args) {
        final Medicine medicineA = new MedicineA("阿司匹林",20.8);
        final Medicine medicineB = new MedicineB("板蓝根", 36.8);
        final Presciption presciption = new Presciption();
        presciption.addMedicine(medicineA);
        presciption.addMedicine(medicineB);


        final Charger charger = new Charger();
        charger.setName("李四");
        presciption.accept(charger);
    }
}
