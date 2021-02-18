package com.accenture.designPattern.behaviour.visitor;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:11
 */
public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("元素B被" + visitor + "访问");
    }
}
