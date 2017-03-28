package com.lym.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/28.
 */
//对象结构
public class ObjectStructure {

    private List<Person> list = new ArrayList<Person>();

    public void attach(Person person)
    {
        list.add(person);
    }

    public void detach(Person person)
    {
        list.remove(person);
    }

    public void display(State state)
    {
        for(Person person : list)
        {
            person.stateReaction(state);
        }
    }
}
