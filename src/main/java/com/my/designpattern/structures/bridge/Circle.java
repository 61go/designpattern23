package com.my.designpattern.structures.bridge;

/**
 * @program: Circle
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:26
 **/


public class Circle extends Shape {
    @Override
    public void draw() {
        color.bePaint("圆形");
    }
}
