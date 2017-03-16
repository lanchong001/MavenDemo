package com.lym.designpatterns.structural.composite;

import java.util.ArrayList;

/**
 * Created by lym on 2017/3/17.
 */
public class City extends Org {

    public City(String name) {
        super(name);
    }

    @Override
    public void setParent(Org parent) throws Exception{
        this.parent = parent;
    }

    @Override
    public void AddChildren(Org children) throws Exception{
        if(this.childrens == null)
            this.childrens = new ArrayList<Org>();
        this.childrens.add(children);
    }
}
