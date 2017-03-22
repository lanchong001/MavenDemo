package com.lym.designpatterns.behavioral.iterator;

/**
 * Created by lym on 2017/3/22.
 */
//Iterator迭代器抽象类
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object CurrentItem();

}
