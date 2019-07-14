package com.my.designpattern.behaviour.interceptor1;

/**
 * 值节点
 */
public class ValueNode implements Node
{
    private int value;
    
    public ValueNode(int value)
    {
        this.value=value;
    }
        
    public int interpret()
    {
        return this.value;
    }
}