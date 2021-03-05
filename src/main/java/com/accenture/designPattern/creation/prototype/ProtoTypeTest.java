package com.accenture.designPattern.creation.prototype;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/5 18:16
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        RealizeType realizeType = new RealizeType();
        try {
            RealizeType clone = realizeType.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
