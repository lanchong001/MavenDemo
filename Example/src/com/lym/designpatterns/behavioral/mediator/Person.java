package com.lym.designpatterns.behavioral.mediator;

/**
 * Created by lym on 2017/3/28.
 */
//人
public abstract class Person {

    private String name;

    protected Agent agent;

    public Person(String name,Agent agent)
    {
        this.name = name;
        this.agent = agent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
