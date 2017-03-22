package com.lym.designpatterns.behavioral.command;

/**
 * Created by lym on 2017/3/22.
 */
//抽象类 命令
public  class Command {

    //命令名称
    private String name;

    //命令设计的数量
    private int number;

    public Command(String name,int number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
