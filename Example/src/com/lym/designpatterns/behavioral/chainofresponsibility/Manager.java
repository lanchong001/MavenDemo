package com.lym.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by lym on 2017/3/22.
 */
//管理者
public abstract class Manager {

    //请求
    protected Request request;

    //管理者名字
    protected String name;

    //上级领导
    protected Manager leadership;

    public Manager(String name,Manager leadership)
    {
        this.name = name;
        this.leadership = leadership;
    }

    //审核请求
    public abstract void review(Request request);
}
