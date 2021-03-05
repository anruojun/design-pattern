package com.accenture.designPattern.structural.proxy.staticproxy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 16:59
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实方法");
    }
}
