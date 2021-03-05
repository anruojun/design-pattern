package com.accenture.designPattern.structural.bridge;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 11:09
 */
public abstract class Abstraction {
    /**
     * 桥接模式，将类的功能层级结构和实现层级结构结合在一起，Abstraction和ExtendAbstraction为功能实现层级，ExtendAbstraction扩展了父类的功能
     * Implementor为实现层级结构，有多个不同的具体实现类，作为实现扩展。组合两者及为桥接
     */
    protected Implementor implementor;
    Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public abstract void operation();
}
