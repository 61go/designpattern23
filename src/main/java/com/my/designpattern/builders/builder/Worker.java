package com.my.designpattern.builders.builder;

public abstract class Worker {
    //创建产品对象 一定得是protected修饰，以便子类能继承
    protected Parlour product = new Parlour();

    public abstract Worker buildWall();

    public abstract Worker buildTV();

    public abstract Worker buildSofa();

    //返回产品对象
    public Parlour build() {
        return product;
    }
}
