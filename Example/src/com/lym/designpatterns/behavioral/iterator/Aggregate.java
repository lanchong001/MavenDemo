package com.lym.designpatterns.behavioral.iterator;

import com.lym.designpatterns.behavioral.observer.Observer;

/**
 * Created by lym on 2017/3/22.
 */
//Aggregate聚集抽象类
public abstract class Aggregate {

    public abstract Iterator CreateIterator();

    public abstract int size();

    public abstract Object getIndex(int current);

    public  abstract void setIndex(int current,Object value);

}
