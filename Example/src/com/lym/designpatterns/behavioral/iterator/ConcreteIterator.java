package com.lym.designpatterns.behavioral.iterator;

/**
 * Created by lym on 2017/3/22.
 */
//具体的迭代器
public class ConcreteIterator extends Iterator {

    private Aggregate aggregate;
    private int current = 0;

    public ConcreteIterator(Aggregate aggregate)
    {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return this.aggregate.getIndex(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if(current < this.aggregate.size())
        {
            ret = this.aggregate.getIndex(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= this.aggregate.size() ? true : false;
    }

    @Override
    public Object CurrentItem() {
        return aggregate.getIndex(current);
    }
}
