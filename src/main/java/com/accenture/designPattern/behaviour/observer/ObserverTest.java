package com.accenture.designPattern.behaviour.observer;


/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 16:00
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        Publisher publisher = new TargetPublisher();
        publisher.add(observerA);
        publisher.add(observerB);
        publisher.publish();
    }
}
