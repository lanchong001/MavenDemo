package com.lym.designpatterns.structural.adapter;

/**
 * Created by lym on 2017/3/14.
 */
//对象的适配器类：实现ITargatable接口,并且持有Source类的实例
public class Warpper implements ITargetable {

    private Source source;

    public Warpper(Source source)
    {
        super();
        this.source = source;
    }


    @Override
    public void method1() {
        this.source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
