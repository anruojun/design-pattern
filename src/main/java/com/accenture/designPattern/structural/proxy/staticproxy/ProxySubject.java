package com.accenture.designPattern.structural.proxy.staticproxy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 16:59
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject = new RealSubject();
    public void preRequest() {
        System.out.println("前置处理");
    }
    @Override
    public void request(){
        preRequest();
        realSubject.request();
        postRequest();
    }
    public void postRequest() {
        System.out.println("后置处理");
    }
}
