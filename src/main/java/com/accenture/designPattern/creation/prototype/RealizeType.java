package com.accenture.designPattern.creation.prototype;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 18:15
 */
public class RealizeType implements Cloneable{
    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("拷贝对象成功");
        return (RealizeType) super.clone();
    }
}
