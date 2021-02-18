package com.accenture.designPattern.behaviour.templateMethod;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 15:45
 */
public class TemplateA extends AbstractTemplate{
    @Override
    public void templateMethodOne() {
        System.out.println("模板方法A的第一个方法被调用");
    }

    @Override
    public void templateMethodTwo() {
        System.out.println("模板方法A的第二个方法被调用");
    }
}
