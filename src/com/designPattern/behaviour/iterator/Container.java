package com.designPattern.behaviour.iterator;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 10:09
 */
public interface Container {
    /**
     * 获取迭代器对象
     * @return 返回实际迭代器对象
     */
    Iterator getIterator();

    /**
     * 添加元素
     * @param element 插入元素
     */
    void add(String element);

    /**
     * 移除指定索引元素
     * @param index 索引
     */
    void remove(int index);
}
