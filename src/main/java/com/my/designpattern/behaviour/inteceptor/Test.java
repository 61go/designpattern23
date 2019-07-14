package com.my.designpattern.behaviour.inteceptor;

/**
 * @program: Calculator
 * @description: 解释器模式 注意和命令模式的区别 这个很常用 在repl中
 * @author: Caffeine61
 * @create: 2019-07-15 02:05
 **/


public class Test {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        final Expression maleExpression = getMaleExpression();
        final Expression marriedWomanExpression = getMarriedWomanExpression();
        final boolean robert = maleExpression.interpret("Robert");
        System.out.println("Robert is 男性？"+robert);
        System.out.println("Julie is 已婚妇女？" + marriedWomanExpression.interpret("Julie"));
    }
}
