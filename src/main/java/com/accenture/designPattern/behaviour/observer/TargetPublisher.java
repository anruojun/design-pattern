package com.accenture.designPattern.behaviour.observer;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 15:55
 */
public class TargetPublisher extends Publisher{
    @Override
    public void publish() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
