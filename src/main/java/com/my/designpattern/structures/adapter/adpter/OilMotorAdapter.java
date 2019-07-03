package com.my.designpattern.structures.adapter.adpter;

import com.my.designpattern.structures.adapter.adaptee.OilMotor;
import com.my.designpattern.structures.adapter.target.Motor;

public class OilMotorAdapter implements Motor {
    private OilMotor oilMotor;

    public OilMotorAdapter(OilMotor oilMotor) {
        this.oilMotor = oilMotor;
    }

    @Override
    public void drive() {
        oilMotor.dirveMe();
    }
}
