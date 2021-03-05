package com.accenture.designPattern.structural.composite;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:31
 */
public class Leaf implements Component{
    private String name;
    Leaf(String name) {
        this.name = name;
    }
    @Override
    public void operation(){
        System.out.println(name + "叶子节点被访问了");
    }
}
