package com.accenture.designPattern.behaviour.templateMethod;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 15:48
 */
public class TemplateTest {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new TemplateA();
        abstractTemplate.templateMethod();
    }
}
