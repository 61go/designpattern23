package com.my.designpattern.builders.factorymethod;

import com.my.designpattern.builders.factorymethod.facotry.AnimalFarm;
import com.my.designpattern.builders.factorymethod.facotry.CowFarm;
import com.my.designpattern.builders.factorymethod.product.Animal;

/**
 * @Author huruipeng
 * @Description 注意工厂方法模式，是将工厂抽象同时产品也被抽象了！通过抽象层发生关联，但是只是单一的工厂生产单一的产品
 * @Date 2019/7/3 11:44
 * @Param   @See http://c.biancheng.net/view/1348.html
 * @creator huruipeng
 * @return
 **/
public class Test {
    private String name;
    private int age;

    public static void main(String[] args) {
        AnimalFarm af = new CowFarm();
        Animal animal = af.newAnimal();
        animal.show();
    }
}
