package com.my.designpattern.behaviour.observer;

/**
 * @program: ObserverConcrete
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 03:33
 **/


public class ObserverConcrete implements Observer {
    @Override
    public void doCallBack(String state) {
        System.out.println("观察者1，观察到主题状态改变，新值为"+state);
    }
}
