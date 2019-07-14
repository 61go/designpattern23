package com.my.designpattern.behaviour.templatemethod;

/**
 * @program: Calculator
 * @description: 模板方法很简单其实。。。。就是抽象类把一系列动作（有顺序的）的步骤给抽象出来，然后由继承类去实现
 * 很经典的一种模式
 * @author: Caffeine61
 * @create: 2019-07-15 01:43
 **/


public class Test {
    public static void main(String[] args) {
        final Cricket cricket = new Cricket();
        cricket.play();

        final Football football = new Football();
        football.play();

    }
}
