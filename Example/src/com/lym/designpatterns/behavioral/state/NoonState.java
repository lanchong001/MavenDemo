package com.lym.designpatterns.behavioral.state;

/**
 * Created by lym on 2017/3/23.
 */
//中午
public class NoonState extends State {


    @Override
    public void workState(Work work) {
        if(work.getTime() == "中午")
            System.out.println("中午想睡觉!");
        else {
            work.setState(new AfternoonState());
            work.showState();
        }
    }
}
