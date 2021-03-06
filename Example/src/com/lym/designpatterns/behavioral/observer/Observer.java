package com.lym.designpatterns.behavioral.observer;

/**
 * Created by lym on 2017/3/21.
 */
//抽象观察者
public abstract class Observer {

    protected   String name;
    protected  Subject subject;
    public Observer(String name,Subject subject)
    {
        this.name = name;
        this.subject = subject;
    }

    public abstract void Update();

}
