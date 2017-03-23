package com.lym.designpatterns.behavioral.state;

/**
 * Created by lym on 2017/3/23.
 */
//上午
public class MorningState extends State {

    @Override
    public void workState(Work work) {
        if(work.getTime() == "上午")
            System.out.println("上午工作状态好!");
        else {
            work.setState(new NoonState());
            work.showState();
        }
    }

}
