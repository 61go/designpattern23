package com.my.designpattern.builders.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author huruipeng
 * @Description 参考 https://juejin.im/post/5cbd2e2de51d456e803516b9
 * @Date  2019/7/2 17:18
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        //验证饿汉式
        Singleton singleton = Singleton.getInstance();
        singleton.test();

        //验证懒汉式
        Singleton1 instance = Singleton1.getInstance();
        instance.test();

        //验证静态内部类式
        Singleton2 instance1 = Singleton2.getInstance();
        instance1.test();
       //验证枚举式 这个可以弥补反序列化的漏洞，所以强烈建议使用枚举
        Singleton3 s3 = Singleton3.INSANCE;
        s3.test();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(fo);
        System.out.println(format);
    }
}
