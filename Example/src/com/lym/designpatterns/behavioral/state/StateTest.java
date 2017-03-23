package com.lym.designpatterns.behavioral.state;

/**
 * Created by lym on 2017/3/23.
 */
public class StateTest {

    public static void main(String[] args)
    {
        Work work = new Work();

        work.setTime("中午");
        work.showState();

    }

}
