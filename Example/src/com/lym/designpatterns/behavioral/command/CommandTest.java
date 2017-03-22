package com.lym.designpatterns.behavioral.command;

/**
 * Created by lym on 2017/3/23.
 */
public class CommandTest {

    public static void main(String[] args)
    {
        Waiter waiter = new Waiter();
        waiter.ask();

        Command command = new Command("牛肉串",5);
        Command command1 = new Command("鸡腿",1);

        waiter.setCommands(command);
        waiter.setCommands(command1);

        waiter.Notify(new Skewer());

        waiter.Checkout();
    }

}
