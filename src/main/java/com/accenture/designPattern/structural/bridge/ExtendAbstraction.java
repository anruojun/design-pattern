package com.accenture.designPattern.structural.bridge;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 11:10
 */
public class ExtendAbstraction extends Abstraction{
    ExtendAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.operationImpl();
        System.out.println("扩展抽象化子类调用了具体化实现者方法");
    }
}
