package com.accenture.designPattern.behaviour.memento;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/25 15:18
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setStatus("开始状态001");
        System.out.println("获取----" + originator.getStatus());
        Administrator administrator = new Administrator();
        administrator.setMemento(originator.createMemento());
        originator.setStatus("当前状态002");
        System.out.println("当前备忘录状态-----" + originator.getStatus());
        originator.restoreMemento(administrator.getMemento());
        System.out.println("恢复后的状态" + originator.getStatus());
    }
}
