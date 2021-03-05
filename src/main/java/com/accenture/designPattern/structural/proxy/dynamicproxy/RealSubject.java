package com.accenture.designPattern.structural.proxy.dynamicproxy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 18:02
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实方法");
    }
}
