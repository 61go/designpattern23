package com.my.designpattern.singleton;

public enum Singleton3 {
    INSANCE("love"),
    ;

    private final String name;

    Singleton3(String name) {
        this.name = name;
    }


    public void test() {
        System.out.println("enum...test");
        System.out.println("name is ..."+name);
    }
}
