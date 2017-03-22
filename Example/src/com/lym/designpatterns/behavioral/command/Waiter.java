package com.lym.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/23.
 */
//服务员
public class Waiter {

    List<Command> commands = new ArrayList<Command>();

    public void ask()
    {
        System.out.println("你好,有什么可以帮到你?");
    }

    public void setCommands(Command command)
    {
        commands.add(command);
    }

    public void Notify(Executor executor)
    {
        for(Command command : commands)
        {
            executor.exe(command);
        }
    }

    public void Checkout()
    {
        for(Command command : commands)
        {
            System.out.println(String.format("您消费了 %s %s 串",command.getName(),command.getNumber()));
        }
    }

}
