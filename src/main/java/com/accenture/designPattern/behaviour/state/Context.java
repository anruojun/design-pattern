package com.accenture.designPattern.behaviour.state;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 17:11
 */
public class Context {

    private State state;

    public Context() {
        state = new StateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }
}
