package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
//状态
public abstract class State {

    public abstract void ManAction(Man man);

    public abstract void WomanAction(Woman woman);

}
