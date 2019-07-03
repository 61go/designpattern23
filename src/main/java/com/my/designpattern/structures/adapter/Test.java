package com.my.designpattern.structures.adapter;

import com.my.designpattern.structures.adapter.adaptee.OilMotor;
import com.my.designpattern.structures.adapter.adpter.OilMotorAdapter;

/**
 * @Author huruipeng
 * @Description 这个是适配器模式，感觉这个模式没什么用
 * @Date 2019/7/3 16:43
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        OilMotor oilMator = new OilMotor();
        OilMotorAdapter oilMotorAdapter = new OilMotorAdapter(oilMator);
        oilMotorAdapter.drive();
    }
}
