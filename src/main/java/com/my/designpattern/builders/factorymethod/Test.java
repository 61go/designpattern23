package com.my.designpattern.builders.factorymethod;

import com.my.designpattern.builders.factorymethod.facotry.AnimalFarm;
import com.my.designpattern.builders.factorymethod.facotry.CowFarm;
import com.my.designpattern.builders.factorymethod.product.Animal;

/**
 * @Author huruipeng
 * @Description 注意工厂方法模式，是将工厂抽象同时产品也被抽象了！通过抽象层发生关联
 * @Date 2019/7/3 11:44
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        AnimalFarm af = new CowFarm();
        Animal animal = af.newAnimal();
        animal.show();
    }
}