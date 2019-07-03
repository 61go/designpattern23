package com.my.designpattern.structures.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author huruipeng
 * @Description cglib动态代理类，注意，cglib更强大，还有，Cglib挺简单的，再者它的API很强大，可以看看。基于ASM。最后，都是代理类中要依赖被代理的对象儿
 * @Date 2019/7/3 16:01
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        WySpecialty wySpecialty = new WySpecialty();
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new WySpecialtyProxy(wySpecialty));
        enhancer.setSuperclass(WySpecialty.class);
        WySpecialty o = (WySpecialty) enhancer.create();
        o.show();

    }
}
