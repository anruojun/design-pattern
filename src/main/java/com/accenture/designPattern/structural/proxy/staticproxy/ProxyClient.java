package com.accenture.designPattern.structural.proxy.staticproxy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 17:00
 */
public class ProxyClient {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }
}
