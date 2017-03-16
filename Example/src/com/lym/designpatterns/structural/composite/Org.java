package com.lym.designpatterns.structural.composite;

import java.util.List;

/**
 * Created by lym on 2017/3/17.
 */
//机构
public abstract class Org {

    //机构名称
    private  String name;

    public Org(String name)
    {
        this.name = name;
    }

    //上级机构
    protected Org parent = null;

    protected List<Org> childrens;

    //设置上级机构
    public abstract void setParent(Org parent)  throws Exception;

    //设置下级机构
    public abstract void AddChildren(Org children)  throws Exception;

    //显示机构
    public void  toShow(int depth)
    {
        char[] tag = new char[depth];
        for (int i = 0; i < tag.length; i++) {
            tag[i] = '-';
        }

        System.out.println(String.format("%s%s",new String(tag),this.name));
        if(this.childrens != null) {
            for (Org organization : this.childrens) {
                organization.toShow(depth + 3);
            }
        }
    };
}
