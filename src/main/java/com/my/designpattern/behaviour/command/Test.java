package com.my.designpattern.behaviour.command;

/**
 * @program: Test
 * @description:最经典模式--命令模式 这个一定要吃透，因为你一定会有用到的时候，我见过
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

    }
}
