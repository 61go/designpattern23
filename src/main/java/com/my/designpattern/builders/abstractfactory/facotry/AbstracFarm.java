package com.my.designpattern.builders.abstractfactory.facotry;

import com.my.designpattern.builders.abstractfactory.product.Animal;
import com.my.designpattern.builders.abstractfactory.product.Plant;

public interface AbstracFarm {
    Animal newAnimal();

    Plant newPlant();
}
