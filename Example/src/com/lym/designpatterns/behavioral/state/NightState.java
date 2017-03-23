package com.lym.designpatterns.behavioral.state;

/**
 * Created by lym on 2017/3/23.
 */
//晚上
public class NightState extends State {

    @Override
    public void workState(Work work) {
        System.out.println("晚上加班苦煎熬!");
    }
}
