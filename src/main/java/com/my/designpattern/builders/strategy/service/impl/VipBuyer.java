package com.my.designpattern.builders.strategy.service.impl;

import com.my.designpattern.builders.strategy.service.Buyer;

import java.math.BigDecimal;

/**
 * 普通会员
 */
public class VipBuyer implements Buyer {

    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        int  superVipExpiredDays  = getSuperVipExpiredDays();
        int superVipLeadDiscountTimes  = getSuperVipLeadDiscountTimes();
        if(superVipExpiredDays < 7 && superVipLeadDiscountTimes ==0){

            return orderPrice.multiply(new BigDecimal(0.8));
        }
        return orderPrice.multiply(new BigDecimal(0.9));
    }

    private int getSuperVipLeadDiscountTimes() {
        return 0;
    }

    private int getSuperVipExpiredDays() {
        return 0;
    }
}