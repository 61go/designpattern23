package com.my.designpattern.builders.abstractfactory.product;

/**
 * @Author huruipeng
 * @Description spirng本身就是一个工厂模式，所以在实际使用过程中，可以根据客户端需要什么，选择在Animal的实现类上加个@Service就可以做到
 * @Date 2019/7/3 11:41
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Cow implements Animal {
    @Override
    public void show() {
        System.out.println("我是一只奶牛，新生产出来的");
    }
}
