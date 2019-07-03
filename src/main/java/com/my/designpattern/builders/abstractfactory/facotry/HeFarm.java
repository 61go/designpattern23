package com.my.designpattern.builders.abstractfactory.facotry;

import com.my.designpattern.builders.abstractfactory.product.Animal;
import com.my.designpattern.builders.abstractfactory.product.Cow;
import com.my.designpattern.builders.abstractfactory.product.Plant;
import com.my.designpattern.builders.abstractfactory.product.XiaoMai;

public class HeFarm implements AbstracFarm {
    @Override
    public Animal newAnimal() {
        return new Cow();
    }

    @Override
    public Plant newPlant() {
        return new XiaoMai();
    }

}
