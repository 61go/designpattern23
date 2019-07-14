package com.my.designpattern.behaviour.command;

public class Stock {
   
   private String name = "ABC";
   private int quantity = 10;

   /**
    * 买股票
    */
   public void buy(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
   }

   /**
    * 卖股票
    */
   public void sell(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
   }
}