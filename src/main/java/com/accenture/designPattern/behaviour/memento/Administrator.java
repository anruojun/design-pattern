package com.accenture.designPattern.behaviour.memento;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 15:18
 */
public class Administrator {
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
