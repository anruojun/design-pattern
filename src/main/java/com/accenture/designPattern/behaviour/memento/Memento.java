package com.accenture.designPattern.behaviour.memento;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 14:20
 */
public class Memento {
    private String status;

    Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
