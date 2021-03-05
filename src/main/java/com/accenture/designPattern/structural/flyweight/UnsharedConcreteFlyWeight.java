package com.accenture.designPattern.structural.flyweight;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:12
 */
public class UnsharedConcreteFlyWeight {
    private String info;

    public UnsharedConcreteFlyWeight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
