package com.accenture.designPattern.behaviour.strategy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 15:23
 */
public class StrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("策略A");
    }
}
