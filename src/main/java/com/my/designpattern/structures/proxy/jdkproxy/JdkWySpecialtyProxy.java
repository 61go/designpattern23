package com.my.designpattern.structures.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author huruipeng
 * @Description InvocationHandler是jdk的一个反射包的类
 * @Date 2019/7/3 14:27
 * @Param
 * @creator huruipeng
 * @return
 * @See https://www.cnblogs.com/akaneblog/p/6720513.html
 **/
public class JdkWySpecialtyProxy implements InvocationHandler {

    private Object targetObject;//需要代理的目标对象

    public Object newProxy(Object targetObject) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        Object invoke = method.invoke(targetObject, args);
        doAfter();
        return invoke;
    }


    private void doBefore() {
        System.out.println("代理预处理");
    }

    private void doAfter() {
        System.out.println("代理后置处理");
    }
}
