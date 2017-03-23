package com.lym.designpatterns.behavioral.state;

/**
 * Created by lym on 2017/3/23.
 */
public class Work {

    private String time;
    //状态
    private State state;

    //初始化,上午状态
    public Work()
    {
        this.state = new MorningState();
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void showState()
    {
        this.state.workState(this);
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
