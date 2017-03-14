package com.lym.designpatterns.structural.adapter;

/**
 * Created by lym on 2017/3/14.
 */
//ISourceable:原接口类
//Wrapper2:实现了原接口的抽象类
//SourceSub:接口适配类
public class SourceSub extends Wrapper2 {

    public void method1()
    {
        System.out.println("the sourceable interface's frist Sub1!");
    }

}
