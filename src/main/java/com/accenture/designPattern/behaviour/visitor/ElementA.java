package com.accenture.designPattern.behaviour.visitor;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:10
 */
public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("元素A被" + visitor + "访问");
    }
}
