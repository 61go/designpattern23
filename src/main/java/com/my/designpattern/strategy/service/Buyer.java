package com.my.designpattern.strategy.service;

import java.math.BigDecimal;

/**
 * @ClassName Buyer
 * @Description 抽象策略类 折扣
 * @Author 61
 * @Date 2019/7/2 15:05
 * @Version 1.0
 * @Copyright: Copyright (c) 2018
 *
 **/
public interface Buyer {

/**
 * @Author huruipeng
 * @Description 计算优惠后的价格
 * @Date  2019/7/2 15:06
 * @Param [orderPrice]
 * @creator huruipeng
 * @return java.math.BigDecimal
 **/
   BigDecimal calPrice(BigDecimal orderPrice);

}
