package com.my.designpattern.behaviour.interceptor1;

import java.util.Stack;

/**
 * @program: Calculator
 * @description: 客户端类
 * @author: Caffeine61
 * @create: 2019-07-15 03:06
 **/


public class Calculator {
    private Node node;
    public void build(String statement) {
        Node left, right;
        final Stack<Node> stack = new Stack<>();

        final String[] statements = statement.split("");
        int v=0;
        for (int i = 0; i < statements.length; i++) {
            final String val = statements[i];
            switch (val) {
                case "*":
                    left = stack.pop();
                    v=Integer.parseInt(statements[++i]);
                    right=new ValueNode(v);
                    stack.push(new MulNode(left,right));
                    break;
                case "/":
                    left = stack.pop();
                    v=Integer.parseInt(statements[++i]);
                    right=new ValueNode(v);
                    stack.push(new DivNode(left,right));
                    break;
                case "%":
                    left = stack.pop();
                    v=Integer.parseInt(statements[++i]);
                    right=new ValueNode(v);
                    stack.push(new ModNode(left,right));
                    break;
                default:
                    stack.push(new ValueNode(Integer.parseInt(val)));
                    break;

            }
        }

        node=stack.pop();
    }

    public int cal() {
        return this.node.interpret();
    }
}
