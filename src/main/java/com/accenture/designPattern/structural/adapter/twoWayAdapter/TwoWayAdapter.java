package com.accenture.designPattern.structural.adapter.twoWayAdapter;

import com.accenture.designPattern.structural.adapter.twoWayAdapter.Adaptee;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 10:56
 */
public class TwoWayAdapter implements Adaptee,Target {
    private Adaptee adaptee;
    private Target target;
    TwoWayAdapter(Adaptee adaptee, Target target) {
        this.adaptee = adaptee;
        this.target = target;
    }
    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
