package com.lym.designpatterns.structural.facade;

/**
 * Created by lym on 2017/3/16.
 */
public class Disk {

    public void startUp()
    {
        System.out.println("磁盘 启动");
    }

    public void shutDown()
    {
        System.out.println("磁盘 停止运行");
    }
}
