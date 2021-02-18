package com.accenture.designPattern.behaviour.strategy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 15:16
 */
public class Context {
    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
