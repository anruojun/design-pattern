package com.accenture.designPattern.behaviour.templateMethod;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 15:44
 */
public abstract class AbstractTemplate {
    public void templateMethod() {
        specialMethod();
        templateMethodOne();
        templateMethodTwo();
    }
    public void specialMethod() {
        System.out.println("通用方法被调用");
    }
    public abstract void templateMethodOne();
    public abstract void templateMethodTwo();
}
