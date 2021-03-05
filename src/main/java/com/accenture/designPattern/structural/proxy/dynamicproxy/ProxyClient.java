package com.accenture.designPattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 18:05
 */
public class ProxyClient {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new ProxySubject(new RealSubject());
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[] {Subject.class},invocationHandler);
        subject.request();
    }
}
