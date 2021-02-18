package com.accenture.designPattern.behaviour.mediator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 11:08
 */
public abstract class Component {
    public Mediator mediator = null;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    /**
     * 接收消息
     * @param message 消息内容
     */
    public abstract void receive(String message);

    /**
     * 发送消息
     * @param message 发送消息
     */
    public abstract void send(String message);
}
