package com.lym.designpatterns.structural.facade;

/**
 * Created by lym on 2017/3/16.
 */
public class FacadeTest {
    public static void main(String[] args)
    {
        //外观模式
        //用户只认识电脑及电脑开机和关机,根本就不用管理电脑内部的主板、CPU、内存及磁盘的开机和关机
        Computer computer = new Computer();
        computer.startUp();  //开机
        computer.shutDown(); //关系
    }
}
