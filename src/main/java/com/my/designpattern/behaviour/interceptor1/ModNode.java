package com.my.designpattern.behaviour.interceptor1;

/**
 * @program: ModNode
 * @description: 模运算表达式
 * @author: Caffeine61
 * @create: 2019-07-15 03:05
 **/


public class ModNode extends SymbolNode {

    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret()%this.right.interpret();
    }
}
