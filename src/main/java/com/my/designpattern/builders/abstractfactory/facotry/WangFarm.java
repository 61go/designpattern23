package com.my.designpattern.builders.abstractfactory.facotry;

import com.my.designpattern.builders.abstractfactory.product.Animal;
import com.my.designpattern.builders.abstractfactory.product.Pig;
import com.my.designpattern.builders.abstractfactory.product.Plant;
import com.my.designpattern.builders.abstractfactory.product.YuMi;

public class WangFarm implements AbstracFarm {
    @Override
    public Animal newAnimal() {
        return new Pig();
    }

    @Override
    public Plant newPlant() {
        return new YuMi();
    }

}
