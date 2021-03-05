package com.accenture.designPattern.structural.adapter.classAndObjectAdapter;


/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/22 17:13
 * @Description: 该类为客户端，用于调用和测试适配器
 */
public class AdapterClient {
    public static void main(String[] args) {
        /**
         * 类适配
         */
        Target target = new ClassAdapter();
        target.request();

        /**
         * 对象适配
         */
        Adaptee adaptee = new Adaptee();
        Target targetObject = new ObjectAdapter(adaptee);
        targetObject.request();
    }
}
