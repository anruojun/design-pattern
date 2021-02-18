package com.accenture.designPattern.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 15:54
 */
public abstract class Publisher {
    List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void publish();
}
