package com.my.designpattern.structures.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: Black
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:25
 **/

@Slf4j
public class Black implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
