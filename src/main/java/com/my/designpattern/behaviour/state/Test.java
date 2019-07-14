package com.my.designpattern.behaviour.state;

/**
 * @program: Test
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 03:51
 * @see ;https://www.cnblogs.com/chenssy/p/3280212.html
 **/


public class Test {
    public static void main(String[] args) {
        final Context context = new Context();
        final StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());
    }
}
