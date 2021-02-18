package com.accenture.designPattern.behaviour.iterator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 10:26
 */
public class IteratorTest {
    public static void main(String[] args) {
        Container container = new ConcreteContainer();
        container.add("test1");
        container.add("test2");
        container.add("test3");
        container.add("test4");
        container.remove(2);
        Iterator iterator = container.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
