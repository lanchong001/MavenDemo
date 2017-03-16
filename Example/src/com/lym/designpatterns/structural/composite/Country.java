package com.lym.designpatterns.structural.composite;

import java.util.ArrayList;

/**
 * Created by lym on 2017/3/17.
 */
//国家没有上级机构了
public class Country extends Org {

    public Country(String name) {
        super(name);
    }

    @Override
    public void setParent(Org parent) throws Exception{
        throw new Exception("没有上级机构了");
    }

    @Override
    public void AddChildren(Org children) {
        if(this.childrens == null)
            this.childrens = new ArrayList<Org>();
        this.childrens.add(children);
    }
}
