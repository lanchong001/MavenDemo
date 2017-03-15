package com.lym.designpatterns.structural.facade;

/**
 * Created by lym on 2017/3/16.
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;
    private Motherboard motherboard;

    public Computer()
    {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
        motherboard = new Motherboard();
    }

    public void startUp()
    {
        motherboard.startUp();
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("电脑 启动");
    }

    public void shutDown()
    {
        disk.shutDown();
        memory.shutDown();
        cpu.shutDown();
        motherboard.shutDown();
        System.out.println("电脑 关闭");
    }

}
