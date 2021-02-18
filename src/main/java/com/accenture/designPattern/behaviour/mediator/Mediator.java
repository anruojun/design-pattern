package com.accenture.designPattern.behaviour.mediator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 11:05
 */
public interface Mediator {
    /**
     * 注册组件到中介者
     * @param component 添加的组件
     */
    void register(Component component);

    /**
     * 转发消息
     * @param current 当前组件
     * @param message 转发消息
     */
    void forward(Component current, String message);
}
