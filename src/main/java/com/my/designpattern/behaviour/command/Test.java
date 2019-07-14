package com.my.designpattern.behaviour.command;

/**
 * @program: Calculator
 * @description:最经典模式--命令模式 这个一定要吃透，因为你一定会有用到的时候，我见过
 *
 * 应用方式
 * 1.定义命令接口
 * 2.实现命令的真实执行者reciever
 * 3.实现命令的调用者invoker
 *
 * 4.用法：API用户只需要实现具体的command，然后传到invoker里用就完了，非常有意思
 * @author: Caffeine61
 * @create: 2019-07-15 01:49
 **/


public class Test {
    public static void main(String[] args) {
        final Stock stock = new Stock();
        final BuyStock buyStock = new BuyStock(stock);
        final SellStock sellStock = new SellStock(stock);
        final Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();


        broker.setOrder(buyStock);
        broker.call();

    }
}
