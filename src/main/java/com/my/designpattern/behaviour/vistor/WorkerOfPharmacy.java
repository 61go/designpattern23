package com.my.designpattern.behaviour.vistor;

public class WorkerOfPharmacy extends Visitor{

    public void visitor(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    public void visitor(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
    
}