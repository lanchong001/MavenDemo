package com.lym.designpatterns.structural.flyweight;

/**
 * Created by lym on 2017/3/20.
 */
public class FlyweightTest  {

   public static void main(String[] args)
    {
        FlyweightFactory factory = new FlyweightFactory();

        WebSite fx = factory.getWebSet("博客");

        fx.show(new User("周伯通"));

        fx.show(new User("黄老邪"));

        WebSite fy = factory.getWebSet("商品展示");

        fy.show(new User("郭靖"));

        fy.show(new User("黄蓉"));

        System.out.println(String.format("得到的网站总数:%s",factory.GetWebSiteCount()));
    }

}
