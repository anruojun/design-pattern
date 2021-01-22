package com.accenture.designPattern.behaviour.chainOfResponsibilitiy;

import java.util.Objects;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 10:05
 */
public class LeaderHandler extends BusinessHandler{
    @Override
    public void handleRequest(int dayNumber) {
        if (dayNumber <= LEADER_LIMIT_DAY) {
            System.out.println("组长准假" + dayNumber + "天");
        }else {
            if (!Objects.isNull(getNextHandler())) {
                System.out.println("请假天数超过组长最大批准天数，交给经理审批");
                getNextHandler().handleRequest(dayNumber);
            }else {
                System.out.println("请假天数太多，无人能批");
            }
        }
    }
}
