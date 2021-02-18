package com.accenture.designPattern.behaviour.visitor;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:10
 */
public interface Element {
    void accept(Visitor visitor);
}
