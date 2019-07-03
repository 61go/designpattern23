package com.my.designpattern.builders.builder;

/**
 * @Author huruipeng
 * @Description 一定要有一个经理类，来组织建造工程
 * @Date 2019/7/3 13:57
 * @Param
 * @creator huruipeng
 * @return
 **/
public class ProjectManager {
    private Worker builder;

    public ProjectManager(Worker worker) {
        this.builder = worker;
    }

    public Parlour decorate() {
        Parlour build = builder.buildTV().buildSofa().buildWall().build();
        return build;
    }
}
