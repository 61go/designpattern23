package com.my.designpattern.behaviour.observer;

import com.google.common.collect.Lists;

import java.util.List;


/**
 * @program: Subject
 * @description: 主题类
 * @author: Caffeine61
 * @create: 2019-07-15 03:27
 **/


public class Subject {
    private List<Observer> observers = Lists.newArrayList();
    private String state;

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 事件
     */

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        observers.stream().parallel().forEach(x->x.doCallBack(this.state));
    }

}
