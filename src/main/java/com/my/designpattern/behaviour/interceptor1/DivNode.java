package com.my.designpattern.behaviour.interceptor1;

/**
 * @program: DivNode
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 03:02
 **/


public class DivNode extends SymbolNode{

    public DivNode(Node left,Node right) {
        super(left,right);
    }

    @Override
    public int interpret() {
        return this.left.interpret()/this.right.interpret();
    }
}
