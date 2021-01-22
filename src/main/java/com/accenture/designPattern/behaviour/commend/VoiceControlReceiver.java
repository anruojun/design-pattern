package com.accenture.designPattern.behaviour.commend;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 16:28
 */
public class VoiceControlReceiver extends  AbstractReceiver{
    @Override
    public void action() {
        System.out.println("接收者收到命令，开始行动");
    }
}
