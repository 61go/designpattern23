package com.my.designpattern.behaviour.strategy.service.impl;

import com.my.designpattern.behaviour.strategy.service.Buyer;

import java.math.BigDecimal;

/**
 * 专属会员
 */
public class ParticularlyVipBuyer implements Buyer {

    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
         if (orderPrice.compareTo(new BigDecimal(30)) > 0) {
            return orderPrice.multiply(new BigDecimal(0.7));
        }
        return orderPrice;

    }
}