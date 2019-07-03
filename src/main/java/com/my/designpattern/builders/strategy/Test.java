package com.my.designpattern.builders.strategy;

import com.my.designpattern.builders.strategy.service.Buyer;
import com.my.designpattern.builders.strategy.service.impl.VipBuyer;

import java.math.BigDecimal;
/**
 * @Author huruipeng
 * @Description 测试类，本质上讲策略模式好像没啥意思。。。。。。。
 * @Date  2019/7/2 16:06
 * @Param
 * @creator huruipeng
 * @return
 **/
public class Test {
    public static void main(String[] args) {
        Buyer buyer = new VipBuyer();
        Cashier cashier = new Cashier(buyer);
        BigDecimal quote = cashier.quote(BigDecimal.valueOf(20));
        System.out.println(quote);

//        思考：这个所谓的策略模式跟普通的bean的注入没啥区别啊.所以策略模式的核心精髓肯定还没出来.

    }
}
