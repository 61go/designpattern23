package com.my.designpattern.builders.factorymethod.facotry;

import com.my.designpattern.builders.factorymethod.product.Animal;
import com.my.designpattern.builders.factorymethod.product.Cow;

public class CowFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        return new Cow();
    }
}
