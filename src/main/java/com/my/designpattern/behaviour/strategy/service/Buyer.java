package com.my.designpattern.behaviour.strategy.service;

import java.math.BigDecimal;

/**
 * @ClassName Buyer
 * @Description TODO
 * @Author 61
 * @Date 2019/7/2 15:22
 * @Version 1.0
 * @Copyright: Copyright (c) 2018
 **/

public interface Buyer {
    BigDecimal calPrice(BigDecimal orderPrice);
}
