package com.my.designpattern.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        JoyModel jm = new JoyModel("中华人民共和国", 53);
        JoyModel joy2 = (JoyModel) jm.clone();
        joy2.test();

    }
}
