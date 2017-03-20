package com.lym.designpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * Created by lym on 2017/3/20.
 */
//享元工厂
public class FlyweightFactory {

  private HashMap<String, ConcreteWebSite> maps = new HashMap<String, ConcreteWebSite>();

    public WebSite getWebSet(String key)
    {
        if(!maps.containsKey(key))
        {
            maps.put(key,new ConcreteWebSite(key));
        }
        return (WebSite)maps.get(key);
    }

    public  int GetWebSiteCount()
    {
        return maps.size();
    }

}
