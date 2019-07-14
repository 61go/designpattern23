package com.my.designpattern.structures.flyweight;

/**
 * @program: Calculator
 * @description: 享元模式很有意思呢，可以节省好多内存呢Q，而且避免创建速度快
 * @author: Caffeine61
 * @create: 2019-07-15 01:20
 **/


public class Test {
    public static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            final Circle circle =(Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(99);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int)(Math.random()*COLORS.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
