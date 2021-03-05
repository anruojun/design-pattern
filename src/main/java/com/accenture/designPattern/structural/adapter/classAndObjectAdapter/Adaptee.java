package com.accenture.designPattern.structural.adapter.classAndObjectAdapter;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:45
 * @Description: 该类用于表示被适配的类，存放实际业务逻辑
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("具体业务代码");
    }
}
