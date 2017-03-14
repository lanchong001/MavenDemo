package com.lym.designpatterns.structural.decorator;

/**
 * Created by lym on 2017/3/14.
 */
//具体服饰类
public class BigTrouser extends Finery {

    public void show()
    {
        System.out.println("垮裤 ");
        super.show();
    }
}
