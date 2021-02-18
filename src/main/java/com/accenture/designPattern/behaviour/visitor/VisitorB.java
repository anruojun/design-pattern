package com.accenture.designPattern.behaviour.visitor;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:08
 */
public class VisitorB implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println("B来访问元素A了");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("B来访问元素B了");
    }
}
