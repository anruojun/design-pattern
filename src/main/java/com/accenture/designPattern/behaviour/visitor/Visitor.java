package com.accenture.designPattern.behaviour.visitor;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:07
 */
public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}
