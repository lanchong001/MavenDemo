package com.lym.designpatterns.structural.flyweight;

/**
 * Created by lym on 2017/3/20.
 */
//具体网站
public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name)
    {
        this.name = name;
    }

    @Override
    public void show(User user) {
        System.out.println(String.format("网站名称:%s,当前用户:%s", this.name,user.getName()));
    }
}
