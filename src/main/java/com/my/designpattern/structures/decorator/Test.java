package com.my.designpattern.structures.decorator;

/**
 * @program: Test
 * @description: 装饰器模式
 * @author: Caffeine61
 * @create: 2019-07-15 01:02
 **/


public class Test {
    public static void main(String[] args) {
        final Shape circle = new Circle();
        final ShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();

    }
}
