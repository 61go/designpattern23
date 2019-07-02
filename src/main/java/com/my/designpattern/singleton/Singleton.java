package com.my.designpattern.singleton;
/**
 * @Author huruipeng
 * @Description 普通饿汉式
 * @Date  2019/7/2 16:51
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Singleton {

    //类加载式即创建对象
    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void test() {
        System.out.println("Hello Singleton");
    }
}
