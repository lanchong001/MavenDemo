package com.lym.designpatterns.structural.decorator;

/**
 * Created by lym on 2017/3/14.
 */
//原始的类
public class Person {

    public Person()
    {

    }

    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println(String.format("装扮的%s",name));
    }

}
