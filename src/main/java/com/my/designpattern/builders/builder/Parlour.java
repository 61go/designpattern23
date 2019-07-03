package com.my.designpattern.builders.builder;

import com.google.gson.Gson;

/**
 * @Author huruipeng
 * @Description 产品是客厅
 * @Date 2019/7/3 13:47
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Parlour {
    private String wall;
    private String TV;
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        System.out.println(new Gson().toJson(this));
    }
}
