package com.lym.designpatterns.structural.composite;

/**
 * Created by lym on 2017/3/17.
 */
//区县机构为基层机构，没有下级机构了
public class Area extends Org {

    public Area(String name) {
        super(name);
    }

    @Override
    public void setParent(Org parent) {
        this.parent = parent;
    }

    @Override
    public void AddChildren(Org children) throws Exception{
        throw new Exception("没有上级机构了");
    }
}
