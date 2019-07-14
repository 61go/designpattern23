package com.my.designpattern.behaviour.interceptor1;

/**
 * 乘法表达式解析
 */
public class MulNode extends SymbolNode
{
    public MulNode(Node left,Node right)
    {
        super(left,right);
    }
    
    public int interpret()
    {
        return left.interpret() * right.interpret();
    }
}