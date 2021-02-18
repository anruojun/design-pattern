package com.accenture.designPattern.behaviour.mediator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 11:42
 */
public class MediatorTest {
    public static void main(String[] args) {
        Component A = new ComponentA();
        Component B = new ComponentB();
        Mediator mediator = new MessageMediator();
        mediator.register(A);
        mediator.register(B);
        A.send("test A to B");
        B.send("test B to A");
    }
}
