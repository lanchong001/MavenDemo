package com.lym.designpatterns.behavioral.command1;

import com.lym.designpatterns.behavioral.command.*;

/**
 * Created by lym on 2017/3/23.
 */
//烤鸡翅命令
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChickenWing();
    }

}
