package com.lym.designpatterns.behavioral.mediator;

/**
 * Created by lym on 2017/3/28.
 */
//房东
public class Landlord extends Person {


    public Landlord(String name, Agent agent) {
        super(name, agent);
    }

    public void  release(String message)
    {
        System.out.println(String.format("我是%s房东,%s",this.getName(),message));
    }

}
