package com.my.designpattern.structures.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class WySpecialtyProxy implements MethodInterceptor {
    private Object target;

    public WySpecialtyProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        doBefore();
        Object invoke = method.invoke(target);
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
