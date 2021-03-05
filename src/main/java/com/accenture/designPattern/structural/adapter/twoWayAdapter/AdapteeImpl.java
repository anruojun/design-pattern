package com.accenture.designPattern.structural.adapter.twoWayAdapter;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 10:55
 */
public class AdapteeImpl implements Adaptee{


    @Override
    public void specificRequest() {
        System.out.println("被适配者业务代码调用");
    }
}
