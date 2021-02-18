package com.accenture.designPattern.behaviour.memento;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 14:18
 */
public class Originator {
    private String status;

    public Memento createMemento() {
        return new Memento(status);
    }

    public void restoreMemento(Memento memento) {
        this.setStatus(memento.getStatus());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
