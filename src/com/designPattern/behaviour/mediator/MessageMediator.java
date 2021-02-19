package com.designPattern.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 11:18
 */
public class MessageMediator implements Mediator{

    private List<Component> components = new ArrayList<>(10);
    @Override
    public void register(Component component) {
        if (Objects.nonNull(component)) {
            components.add(component);
            component.setMediator(this);
        }
    }

    @Override
    public void forward(Component current, String message) {
        for (Component component : components) {
            if (!Objects.equals(component,current)) {
                component.receive(message);
            }
        }
    }
}
