package com.my.designpattern.builders.strategy;

import com.my.designpattern.builders.strategy.service.Buyer;

import java.math.BigDecimal;

public class Cashier {

    /**
     * 会员,策略对象
     * 如果是spring容器，这里可以使用注入@Resource
     */
    private Buyer buyer;

    public Cashier(Buyer buyer){
        this.buyer = buyer;
    }

    public Cashier() {

    }

    public BigDecimal quote(BigDecimal orderPrice) {
        return this.buyer.calPrice(orderPrice);
    }
}
