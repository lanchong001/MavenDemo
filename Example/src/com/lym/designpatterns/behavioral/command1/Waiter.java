package com.lym.designpatterns.behavioral.command1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/23.
 */
//服务员
public class Waiter {

    private List<Command> list = new ArrayList<Command>();

    //设置订单
    public void SetOrder(Command command)
    {
        list.add(command);
    }

    //取消订单
    public void RemoveOrder(Command command)
    {
        list.remove(command);
    }

    public void notifyExec()
    {
        for(Command command : list)
        {
            command.executeCommand();
        }
    }
}
