package com.my.designpattern.singleton;

import java.util.Objects;

/**
 * @Author huruipeng
 * @Description //普通懒汉式+ 双重检查 DCL
 * @Date 2019/7/2 16:55
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Singleton1 {
    private static volatile Singleton1 instance;

    public static  Singleton1 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton1.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

    public void test() {
        System.err.println("test right");
    }
}
