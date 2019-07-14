package com.my.designpattern.behaviour.state;

/**
 * @program: Context
 * @description:包含状态的上下文
 * @author: Caffeine61
 * @create: 2019-07-15 03:48
 **/


public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
