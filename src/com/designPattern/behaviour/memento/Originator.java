package com.designPattern.behaviour.memento;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 14:18
 */
public class Originator {
    private String status;
    private Memento memento;

    public void createMemento() {
        this.memento = new Memento(status);
    }

    public void restoreMemento(Memento memento) {
        this.memento = memento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
