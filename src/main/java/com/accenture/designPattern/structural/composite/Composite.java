package com.accenture.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:33
 */
public class Composite implements Component{

    private List<Component> childLists = new ArrayList<>();

    public void add(Component component) {
        childLists.add(component);
    }

    public void remove(Component component) {
        childLists.remove(component);
    }

    public Component get(int i) {
        return childLists.get(i);
    }

    @Override
    public void operation() {
        System.out.println("树枝被访问了");
        for (int i = 0; i < childLists.size(); i++) {
            childLists.get(i).operation();
        }
    }
}
