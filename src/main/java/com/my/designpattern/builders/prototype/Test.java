package com.my.designpattern.builders.prototype;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        JoyModel joy1 = new JoyModel("中华人民共和国", 53);
        JoyModel joy2 = (JoyModel) joy1.clone();
        joy2.test();
        System.out.println(joy1 == joy2);
        System.out.println(new Gson().toJson(joy2));
        System.out.println(new Gson().toJson(joy1));

    }
}
