package com.my.designpattern.behaviour.interceptor1;

/**
 * @program: Test
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 03:19
 **/


public class Test {
    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
        calculator.build("3*2*4/6%5");
        System.out.println(calculator.cal());
    }
}
