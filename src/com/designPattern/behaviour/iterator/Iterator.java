package com.designPattern.behaviour.iterator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 10:05
 */
public interface Iterator {
    /**
     * 判断是否还有下一个元素
     * @return true为含有，false不含
     */
    Boolean hasNext();

    /**
     * 迭代下一个元素
     * @return 返回目标对象
     */
    Object next();
}
