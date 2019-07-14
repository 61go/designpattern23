package com.my.designpattern.structures.bridge;

/**
 * @program: Rectangle
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:27
 **/


public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.bePaint("正方形");
    }
}
