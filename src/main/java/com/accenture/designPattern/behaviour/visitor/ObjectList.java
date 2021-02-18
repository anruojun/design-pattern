package com.accenture.designPattern.behaviour.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/28 16:13
 */
public class ObjectList {
    public List<Element> list = new ArrayList<>();
    public void add(Element e) {
        list.add(e);
    }
    public void remove(Element e) {
        list.remove(e);
    }
    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

}
