package com.lym.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/17.
 */
//机构
public class Organization {

    //机构名称
    private String name;

    //上级机构
    private Organization parent;

    //下级机构
    private List<Organization> children;

    public Organization(String name)
    {
        this.name = name;
        children = new ArrayList<Organization>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }

    //添加下级机构
    public void Add(Organization organization)
    {
        organization.setParent(this);
        this.children.add(organization);
    }

    //撤销下级机构
    public void Remove(Organization organization)
    {
        this.children.remove(organization);
    }

    public void toShow(int depth)
    {
        char[] tag = new char[depth];
        for (int i = 0; i < tag.length; i++) {
            tag[i] = '-';
        }

        System.out.println(String.format("%s%s",new String(tag),this.getName()));
        for(Organization organization : this.children)
        {
            organization.toShow(depth + 3);
        }
    }
}
