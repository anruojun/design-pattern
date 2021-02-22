package com.designPattern.behaviour.chainOfResponsibilitiy;

import java.util.Objects;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/21 10:06
 */
public class BossHandler extends BusinessHandler{
    @Override
    public void handleRequest(int dayNumber) {
        if (dayNumber <= BOSS_LIMIT_DAY) {
            System.out.println("Boss准假" + dayNumber +"天");
        }else {
            if (!Objects.isNull(getNextHandler())) {
                getNextHandler().handleRequest(dayNumber);
            }else {
                System.out.println("请假" + dayNumber + "天太多了，最多请假" + BOSS_LIMIT_DAY);
            }
        }
    }
}
