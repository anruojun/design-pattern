package com.accenture.designPattern.behaviour.chainOfResponsibilitiy;

import java.util.Objects;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 10:05
 */
public class ManagerHandler extends BusinessHandler{
    @Override
    public void handleRequest(int dayNumber) {
        if (dayNumber <= MANAGER_LIMIT_DAY) {
            System.out.println("经理准假" + dayNumber +"天");
        }else {
            if (!Objects.isNull(getNextHandler())) {
                System.out.println("请假天数大于经理能给的最大天数，委托给Boss审批");
                getNextHandler().handleRequest(dayNumber);
            }else {
                System.out.println("请假天数太多了，没人给批");
            }
        }
    }
}
