package com.accenture.designPattern.structural.adapter.twoWayAdapter;

/**
 * @Author: peng.c.zhang
 * @Date: 2021/2/23 10:59
 */
public class AdapterClient {
    public static void main(String[] args) {
        /**
         * 双向适配器
         */
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(new AdapteeImpl(),new TargetImpl());
        twoWayAdapter.request();
        twoWayAdapter.specificRequest();
    }
}
