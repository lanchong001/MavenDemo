package com.lym.designpatterns.structural.facade;

/**
 * Created by lym on 2017/3/16.
 */
//主板
public class Motherboard {

    public void startUp()
    {
        System.out.println("主板 启动");
    }

    public void shutDown()
    {
        System.out.println("主板 停止运行");
    }
}
