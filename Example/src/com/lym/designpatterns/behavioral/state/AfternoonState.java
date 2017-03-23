package com.lym.designpatterns.behavioral.state;

/**
 * Created by lym on 2017/3/23.
 */
//下午
public class AfternoonState extends State {

    @Override
    public void workState(Work work) {
        if(work.getTime() == "下午")
            System.out.println("下午渐渐恢复!");
        else {
            work.setState(new NightState());
            work.showState();
        }
    }
}
