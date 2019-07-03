package com.my.designpattern.builders.builder;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker1();
        ProjectManager projectManager = new ProjectManager(worker);
        Parlour decorate = projectManager.decorate();
        decorate.show();
        Worker2 worker2 = new Worker2();
        ProjectManager projectManager1 = new ProjectManager(worker2);
        Parlour decorate1 = projectManager1.decorate();
        decorate1.show();

    }
}
