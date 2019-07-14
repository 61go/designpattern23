package com.my.designpattern.behaviour.mediator;

/**
 * @program: Test
 * @description:中介者模式
 * @author: Caffeine61
 * @create: 2019-07-15 04:08
 **/


public class Test {
    public static void main(String[] args) {
        Mediator mediator=new MediatorStructure();

        final HouseOwner houseOwner = new HouseOwner("张三",mediator);
        final Tenant tenant = new Tenant("李四", mediator);

        ((MediatorStructure) mediator).setHouseOwner(houseOwner);
        ((MediatorStructure) mediator).setTenant(tenant);


        houseOwner.constact("你需要租房吗？");
        tenant.constact("是的，我需要租房！");
    }
}
