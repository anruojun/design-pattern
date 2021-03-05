package com.accenture.designPattern.structural.decorator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/3 15:39
 */
public abstract class Decorator {
    private Component component;
    Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
