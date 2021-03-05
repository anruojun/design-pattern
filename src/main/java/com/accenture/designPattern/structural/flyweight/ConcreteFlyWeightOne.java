package com.accenture.designPattern.structural.flyweight;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:14
 */
public class ConcreteFlyWeightOne implements FlyWeight{
    private String key;

    public ConcreteFlyWeightOne(String key) {
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyWeight state) {
        System.out.println("注入的属性"+state.getInfo()+"当前key为"+key);
    }
}
