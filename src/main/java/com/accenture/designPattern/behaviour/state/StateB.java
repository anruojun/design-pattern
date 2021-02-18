package com.accenture.designPattern.behaviour.state;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 17:11
 */
public class StateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态为" + context.getState());
    }
}
