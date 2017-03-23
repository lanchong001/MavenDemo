package com.lym.designpatterns.behavioral.command1;

import com.lym.designpatterns.behavioral.command.*;

/**
 * Created by lym on 2017/3/23.
 */
public class CommandTest {

    public static void main(String[] args)
    {
        Barbecuer boy = new Barbecuer();
        Command command = new BakeChickenWingCommand(boy);
        Command command1 = new BakeMuttonCommand(boy);
        Command command2 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();
        girl.SetOrder(command);
        girl.SetOrder(command1);
        girl.SetOrder(command2);

        girl.notifyExec();
    }

}
