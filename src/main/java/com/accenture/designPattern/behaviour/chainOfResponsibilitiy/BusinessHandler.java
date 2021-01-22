package com.accenture.designPattern.behaviour.chainOfResponsibilitiy;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/20 18:30
 */
public abstract class BusinessHandler {
    public static final int LEADER_LIMIT_DAY = 3;
    public static final int MANAGER_LIMIT_DAY = 5;
    public static final int BOSS_LIMIT_DAY = 10;
    public BusinessHandler handler;
    /**
     * 设置下一个处理器
     * */
    public void setNextHandler(BusinessHandler nextHandler) {
        handler = nextHandler;
    }

    public BusinessHandler getNextHandler() {
        return handler;
    }
    /**
     * 请假天数
     * */
    public abstract void handleRequest(int dayNumber);

}
