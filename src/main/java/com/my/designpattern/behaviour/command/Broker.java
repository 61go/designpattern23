package com.my.designpattern.behaviour.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用类
 */
public class Broker {
   private List<Order> orderList = new ArrayList<Order>();
   private Order order;
   public void takeOrder(Order order){
      orderList.add(order);      
   }
 
   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }

   public void setOrder(Order order) {
      this.order = order;

   }

   public void call() {
      this.order.execute();
   }


}