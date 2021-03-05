package com.accenture.designPattern.structural.adapter.twoWayAdapter;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 10:55
 */
public class TargetImpl implements Target{
    @Override
    public void request() {
        System.out.println("适配目标业务业务代码被调用");
    }
}
