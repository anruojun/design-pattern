package com.accenture.designPattern.structural.bridge;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 11:13
 */
public class ConcreteImplementor implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体化操作者被调用");
    }
}
