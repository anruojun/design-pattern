package com.accenture.designPattern.behaviour.visitor;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:07
 */
public class VisitorA implements Visitor {

    @Override
    public void visit(ElementA elementA) {
        System.out.println("A来访问元素A了");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("A来访问元素B了");
    }
}
