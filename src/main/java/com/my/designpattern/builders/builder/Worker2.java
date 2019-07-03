package com.my.designpattern.builders.builder;

/**
 * @Author huruipeng
 * @Description 工人1的干活方案
 * @Date 2019/7/3 13:51
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Worker2 extends Worker {
    @Override
    public Worker buildWall() {
        product.setWall("wall2");
        return this;
    }

    @Override
    public Worker buildTV() {
        product.setTV("tv2");
        return this;

    }

    @Override
    public Worker buildSofa() {
        product.setSofa("sofa2");
        return this;

    }
}
