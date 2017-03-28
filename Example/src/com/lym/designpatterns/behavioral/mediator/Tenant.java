package com.lym.designpatterns.behavioral.mediator;

/**
 * Created by lym on 2017/3/28.
 */
//租客
public class Tenant extends Person {


    public Tenant(String name, Agent agent) {
        super(name, agent);
    }

    public void release(String message)
    {
        System.out.println(String.format("我是%s租客,%s",this.getName(),message));
    }
}
