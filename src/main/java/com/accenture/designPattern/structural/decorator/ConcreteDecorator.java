package com.accenture.designPattern.structural.decorator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/3 15:39
 */
public class ConcreteDecorator extends Decorator{
    int a = 10;
    ConcreteDecorator(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("装饰增强");
    }

    public static void main(String[] args) {
        new ConcreteComponent().operation();
        new ConcreteDecorator(new ConcreteComponent()).operation();
    }
}
