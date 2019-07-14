package com.my.designpattern.structures.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: White
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:15
 **/
@Slf4j
public class White implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("白色的"+shape);
    }
}
