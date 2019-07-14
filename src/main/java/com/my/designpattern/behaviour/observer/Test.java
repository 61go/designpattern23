package com.my.designpattern.behaviour.observer;

/**
 * @program: Test
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 03:27
 **/


public class Test {
    public static void main(String[] args) {
        final ObserverConcrete observerConcrete1 = new ObserverConcrete();
        final Subject subject = new Subject();
        subject.attach(observerConcrete1);
        subject.setState("lilei");
    }
}
