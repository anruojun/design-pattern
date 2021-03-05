package com.accenture.designPattern.structural.composite;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:37
 */
public class Client {
    public static void main(String[] args) {
        Composite component1 = new Composite();
        Composite component2 = new Composite();
        Component leaf1 = new Leaf("one");
        Component leaf2 = new Leaf("two");
        Component leaf3 = new Leaf("three");
        Component leaf4 = new Leaf("four");
        component1.add(leaf1);
        component1.add(leaf2);
        component2.add(leaf3);
        component2.add(leaf4);
        component1.operation();
        component2.operation();
    }
}
