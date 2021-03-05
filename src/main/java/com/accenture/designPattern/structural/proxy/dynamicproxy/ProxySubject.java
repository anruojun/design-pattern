package com.accenture.designPattern.structural.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 17:19
 */
public class ProxySubject implements InvocationHandler {
    private Object proxyObject;

    public ProxySubject(Object proxyObject) {
        this.proxyObject = proxyObject;
    }

    public Object newProxyInstance() {
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(), proxyObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");
        Object result = method.invoke(proxyObject,args);
        System.out.println("调用后");
        return result;
    }
}
