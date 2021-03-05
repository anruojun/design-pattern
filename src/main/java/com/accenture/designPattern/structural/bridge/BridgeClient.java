package com.accenture.designPattern.structural.bridge;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 11:18
 */
public class BridgeClient {
    public static void main(String[] args) {
        Abstraction abstraction = new ExtendAbstraction(new ConcreteImplementor());
        abstraction.operation();
    }
}
