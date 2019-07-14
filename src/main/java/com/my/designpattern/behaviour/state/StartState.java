package com.my.designpattern.behaviour.state;

/**
 * @program: StartState
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 03:50
 **/


public class StartState implements State {
    @Override
    public void doAction(Context ctx) {
        ctx.setState(this);
    }
}
