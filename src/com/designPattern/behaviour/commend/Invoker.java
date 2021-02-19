package com.designPattern.behaviour.commend;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 12:09
 */
public class Invoker {

    public Invoker(AbstractCommend commend) {
        this.commend = commend;
    }

    private AbstractCommend commend;

    public AbstractCommend getCommend() {
        return commend;
    }

    public void setCommend(AbstractCommend commend) {
        this.commend = commend;
    }

    public void call() {
        System.out.println("执行者调用命令");
        commend.execute();
    }
    public void call(AbstractCommend commend) {
        commend.execute();
    }

    public static void main(String[] args) {
        new Invoker(new VoiceControlCommend()).call();
    }
}