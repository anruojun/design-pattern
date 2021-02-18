package com.accenture.designPattern.behaviour.state;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 17:18
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
    }
}
