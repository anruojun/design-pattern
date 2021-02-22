package com.designPattern.behaviour.mediator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 11:17
 */
public class ComponentB extends Component{
    @Override
    public void receive(String message) {
        System.out.println("组件B接收到转发消息，消息内容为" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("组件B请求转发消息，消息内容为" + message);
        mediator.forward(this, message);
    }
}
