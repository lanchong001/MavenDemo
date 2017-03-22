package com.lym.designpatterns.behavioral.iterator;

/**
 * Created by lym on 2017/3/22.
 */
public class IteratorTest {

    public static void main(String[] args)
    {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.setIndex(0,"大鸟");
        aggregate.setIndex(1,"小菜");
        aggregate.setIndex(2,"行李");
        aggregate.setIndex(3,"老外");
        aggregate.setIndex(4,"公交内部员工");
        aggregate.setIndex(5,"小偷");

        Iterator iterator = new ConcreteIterator(aggregate);
        while (!iterator.isDone())
        {
            System.out.println(String.format("从前到后, %s 请买票!",iterator.CurrentItem()));
            iterator.next();
        }

        Iterator desc = new ConcreteIteratorDesc(aggregate);
        while (!desc.isDone())
        {
            System.out.println(String.format("从后到前, %s 请买票!",desc.CurrentItem()));
            desc.next();
        }
    }


}
