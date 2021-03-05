package com.accenture.designPattern.structural.flyweight;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:13
 */
public class FlyWeightPattern {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight one = flyWeightFactory.getFlyWeight("one");
        FlyWeight two = flyWeightFactory.getFlyWeight("two");
        one.operation(new UnsharedConcreteFlyWeight("被One调用了"));
        two.operation(new UnsharedConcreteFlyWeight("被Two调用了"));
    }
}
