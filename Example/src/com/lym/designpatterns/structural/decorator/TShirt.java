package com.lym.designpatterns.structural.decorator;

/**
 * Created by lym on 2017/3/14.
 */
//具体服饰类
public class TShirt extends Finery {

    @Override
    public  void show()
    {
        System.out.println("大T恤 ");
        super.show();
    }

}
