package com.lym.designpatterns.behavioral.iterator;

import com.lym.designpatterns.behavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/22.
 */
//具体的聚合类
public class ConcreteAggregate extends Aggregate {

    List<Object> list = new ArrayList<Object>();

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object getIndex(int current) {
        return list.get(current);
    }

    @Override
    public void setIndex(int current, Object value) {
        list.add(current,value);
        //注意这里不能使用list.set(current,value);
    }
}
