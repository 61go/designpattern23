package com.my.designpattern.structures.bridge;

/**
 * @program: Calculator
 * @description: 上传桥接模式
 * 桥接模式比较难懂，需要一点智慧
 * @author: Caffeine61
 * @create: 2019-07-15 00:28
 **/


public class Test {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape squar = new Square();

        Color white = new White();
        Color black = new Black();

        circle.setColor(black);
        circle.draw();

        squar.setColor(white);
        squar.draw();


    }
}
