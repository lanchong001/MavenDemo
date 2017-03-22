package com.lym.designpatterns.behavioral.command;

/**
 * Created by lym on 2017/3/22.
 */
//烤串师傅
public class Skewer extends Executor {

    @Override
    public void exe(Command command) {
        System.out.println(String.format("已经烤好了 %s %s 串",command.getName(),command.getNumber()));
    }
}
