package com.lym.designpatterns.structural.adapter;

/**
 * Created by lym on 2017/3/14.
 */
//ISourceable:原接口类
//Wrapper2:实现了原接口的抽象类
//SourceSub:接口适配类
public abstract class Wrapper2 implements ISourceable {

    public void method1()   //只实现不做任何处理
    {

    }

    public  void method2()  //只实现不做任何处理
    {

    }
}
