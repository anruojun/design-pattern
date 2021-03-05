package com.accenture.designPattern.structural.adapter.classAndObjectAdapter;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/22 17:24
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
