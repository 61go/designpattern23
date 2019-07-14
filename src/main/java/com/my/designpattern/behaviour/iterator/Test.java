package com.my.designpattern.behaviour.iterator;

/**
 * @program: Test
 * @description:迭代器模式
 * @author: Caffeine61
 * @create: 2019-07-15 03:39
 **/


public class Test {
    public static void main(String[] args) {
        final NameRepository nameRepository = new NameRepository();
        final Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            final String next = (String)iterator.next();
            System.out.println(next);
        }
    }
}
