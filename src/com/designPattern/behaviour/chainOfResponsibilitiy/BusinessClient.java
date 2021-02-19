package com.designPattern.behaviour.chainOfResponsibilitiy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 10:33
 */
public class BusinessClient {
    public static void main(String[] args) {
        BusinessHandler handlerOne = new LeaderHandler();
        BusinessHandler handlerTwo = new ManagerHandler();
        BusinessHandler handlerThree = new BossHandler();
        handlerOne.setNextHandler(handlerTwo);
        handlerTwo.setNextHandler(handlerThree);
        handlerOne.handleRequest(20);
    }
}
