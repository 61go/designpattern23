package com.my.designpattern.singleton;

import java.io.Serializable;

/**
 * @Author huruipeng
 * @Description 普通饿汉式
 * @Date 2019/7/2 16:51
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Singleton implements Serializable {


    //一定要注意这里，必须声明私有的构造器，不然人家能直接new出来
    private Singleton() {
    }

    //类加载式即创建对象
    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void test() {
        System.out.println("Hello Singleton");
    }

    //防止反序列化破坏单子
    private Object readResolve() {
        return INSTANCE;
    }

}
