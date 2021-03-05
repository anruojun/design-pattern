package com.accenture.designPattern.structural.facade;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 17:54
 */
public class Facade {
    private SubSystemOne subSystemOne = new SubSystemOne();
    private SubSystemTwo subSystemTwo = new SubSystemTwo();
    private SubSystemThree subSystemThree = new SubSystemThree();
    public void method(String username) {
        System.out.println(username+"登录了外观系统");
        subSystemOne.method(username);
        subSystemThree.method(username);
        subSystemTwo.method(username);
    }
}
