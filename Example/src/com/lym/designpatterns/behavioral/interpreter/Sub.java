package com.lym.designpatterns.behavioral.interpreter;

/**
 * Created by lym on 2017/3/28.
 */
//减法
public class Sub extends Operator {
    @Override
    public int calculation(Context context) {
        return context.getNumber1() - context.getNumber2();
    }
}
