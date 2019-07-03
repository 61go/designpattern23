package com.my.designpattern.structures.adapter.adpter;

import com.my.designpattern.structures.adapter.adaptee.GasMotor;
import com.my.designpattern.structures.adapter.target.Motor;

public class GasMotorAdapter implements Motor {
    private GasMotor gasMotor;

    public GasMotorAdapter(GasMotor gasMotor) {
        this.gasMotor = gasMotor;
    }

    @Override
    public void drive() {
        gasMotor.dirveMe();
    }
}
