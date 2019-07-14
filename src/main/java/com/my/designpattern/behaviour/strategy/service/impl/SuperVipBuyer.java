package com.my.designpattern.behaviour.strategy.service.impl;

import com.my.designpattern.behaviour.strategy.service.Buyer;

import java.math.BigDecimal;

/**
 * 超级会员
 */
public class SuperVipBuyer implements Buyer {

    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.8));
    }
}