package com.my.designpattern.behaviour.mediator;

public abstract class Person {
    protected String name;
    protected Mediator mediator;
    
    Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
    
}