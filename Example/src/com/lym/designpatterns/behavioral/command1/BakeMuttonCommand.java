package com.lym.designpatterns.behavioral.command1;

import com.lym.designpatterns.behavioral.command.*;

/**
 * Created by lym on 2017/3/23.
 */
//烤羊肉命令
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeMutton();
    }
}
