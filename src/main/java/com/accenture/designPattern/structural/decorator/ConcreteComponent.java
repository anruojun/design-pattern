package com.accenture.designPattern.structural.decorator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/3 15:38
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("当组件功能");
    }
}
