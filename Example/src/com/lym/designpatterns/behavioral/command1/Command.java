package com.lym.designpatterns.behavioral.command1;

/**
 * Created by lym on 2017/3/23.
 */
//抽象命令
public abstract class Command {

    protected  Barbecuer barbecuer;

    public Command(Barbecuer barbecuer)
    {
        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();

}
