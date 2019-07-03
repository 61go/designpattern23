package com.my.designpattern.builders.abstractfactory;

import com.my.designpattern.builders.abstractfactory.facotry.AbstracFarm;
import com.my.designpattern.builders.abstractfactory.facotry.HeFarm;
import com.my.designpattern.builders.abstractfactory.facotry.WangFarm;
import com.my.designpattern.builders.abstractfactory.product.Animal;
import com.my.designpattern.builders.abstractfactory.product.Plant;

/**
 * @Author huruipeng
 * @Description 这个主要是抽象出产品族，是对工厂的彻底抽象，这个把产品族都抽象出来了，比较厉害
 * @Date 2019/7/3 11:57
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        AbstracFarm farm = new HeFarm();
        Animal animal = farm.newAnimal();
        animal.show();
        Plant plant = farm.newPlant();
        plant.show();
        AbstracFarm farm2 = new WangFarm();
        Animal animal2 = farm2.newAnimal();
        animal2.show();
        Plant plant2 = farm2.newPlant();
        plant2.show();
    }
}
