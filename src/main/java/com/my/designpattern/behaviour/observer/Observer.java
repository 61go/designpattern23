package com.my.designpattern.behaviour.observer;

/**
 * @program:
 * @description:观察者接口
 * @author: Caffeine61
 * @create: 2019-07-15 03:29
 **/

public interface Observer {
    //订阅主题，主题类发生变化时，通知我
    void doCallBack(String state);
}
