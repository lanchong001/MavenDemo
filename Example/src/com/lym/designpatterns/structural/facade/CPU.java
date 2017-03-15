package com.lym.designpatterns.structural.facade;

import com.lym.javademo.Java_Exception_Handler.SystemErrPrintln;

/**
 * Created by lym on 2017/3/16.
 */
public class CPU {

    public void startUp()
    {
        System.out.println("CPU 启动");
    }

    public void shutDown()
    {
        System.out.println("CPU 停止运行");
    }

}
