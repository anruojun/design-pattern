package com.accenture.designPattern.behaviour.visitor;


/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:12
 */
public class VisitorTest {
    public static void main(String[] args) {
        Visitor visitorA = new VisitorA();
        Visitor visitorB = new VisitorB();
        Element elementA = new ElementA();
        Element elementB = new ElementB();
        ObjectList list = new ObjectList();
        list.add(elementA);
        list.add(elementB);
        list.accept(visitorA);
        list.accept(visitorB);
    }
}
