package com.accenture.designPattern.structural.flyweight;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/3/4 18:13
 */
public class FlyWeightFactory {
    private HashMap<String, FlyWeight> flyWeightHashMap = new HashMap<>();
    public FlyWeight getFlyWeight(String key) {
        if (Objects.isNull(key)) {
            return null;
        }else if (Objects.isNull(flyWeightHashMap.get(key))) {
            flyWeightHashMap.put(key, new ConcreteFlyWeightOne(key));
            return flyWeightHashMap.get(key);

        }else {
            return flyWeightHashMap.get(key);

        }
    }
}
