package com.lym.designpatterns.structural.flyweight;

/**
 * Created by lym on 2017/3/20.
 */
//用户
public class User {

    private String name;

    public  User(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

}
