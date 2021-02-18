package com.accenture.designPattern.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/1/22 10:12
 */
public class ConcreteContainer implements Container{

    private List<String> elements = new ArrayList<>(10);

    @Override
    public void add(String element) {
        if (Objects.nonNull(element)) {
            elements.add(element);
        }
    }

    @Override
    public void remove(int index) {
        if (index < elements.size()) {
            elements.remove(index);
        }
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(elements);
    }


    class ConcreteIterator implements Iterator {

        private List<? extends Object> objects = null;
        int index = -1;
        ConcreteIterator(List<? extends Object> objects) {
            this.objects = objects;
        }
        @Override
        public Boolean hasNext() {
            return objects.size() > index+1 ? true : false;
        }

        @Override
        public Object next() {
            index++;
            return objects.get(index);
        }
    }
}
