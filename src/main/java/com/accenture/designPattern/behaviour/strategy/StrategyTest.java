package com.accenture.designPattern.behaviour.strategy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 15:25
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();
        context.setStrategy(strategyA);
        context.strategyMethod();
        context.setStrategy(strategyB);
        context.strategyMethod();
    }
}
