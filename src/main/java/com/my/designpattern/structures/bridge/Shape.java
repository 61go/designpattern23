package com.my.designpattern.structures.bridge;

/**
 * @program: Shape
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:12
 * @see :https://www.runoob.com/w3cnote/bridge-pattern2.html
 **/



/**
 * 抽象类
 */
public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *抽象类的行为
     */
    public abstract void draw();
}
