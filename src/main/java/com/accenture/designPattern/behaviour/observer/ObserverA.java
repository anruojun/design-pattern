package com.accenture.designPattern.behaviour.observer;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 15:54
 */
public class ObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("A收到了消息");
    }
}
