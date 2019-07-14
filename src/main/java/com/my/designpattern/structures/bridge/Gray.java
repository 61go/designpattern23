package com.my.designpattern.structures.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: Gray
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-15 00:24
 **/

@Slf4j
public class Gray implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("灰色的"+shape);
    }
}
