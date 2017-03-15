package com.lym.designpatterns.structural.proxy;

/**
 * Created by lym on 2017/3/16.
 */
public abstract class Person {

    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
