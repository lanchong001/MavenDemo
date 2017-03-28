package com.lym.designpatterns.behavioral.interpreter;

/**
 * Created by lym on 2017/3/28.
 */
//加法
public class Add extends Operator {
    @Override
    public int calculation(Context context) {

        return  context.getNumber1() + context.getNumber2();

    }
}
