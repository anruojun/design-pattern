package com.designPattern.behaviour.commend;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 16:28
 */
public class VoiceControlCommend extends AbstractCommend{

    private AbstractReceiver receiver;
    @Override
    public void execute() {
        System.out.println("接收者接收到命令");
        receiver = new VoiceControlReceiver();
        receiver.action();
    }

}
