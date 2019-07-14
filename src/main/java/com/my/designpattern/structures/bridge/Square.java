package com.my.designpattern.structures.bridge;

/**
 * @program: Square
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:27
 **/


public class Square extends Shape {
    @Override
    public void draw() {
        color.bePaint("正方形");
    }
}
