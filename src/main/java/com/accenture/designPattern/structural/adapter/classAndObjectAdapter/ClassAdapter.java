package com.accenture.designPattern.structural.adapter.classAndObjectAdapter;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:44
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
