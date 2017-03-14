package com.lym.designpatterns.structural.adapter;

/**
 * Created by lym on 2017/3/14.
 */
//类的适配器类：继承原类,实现待适配的接口
public class Adapter extends Source implements  ITargetable {

    @Override
    public void method2() {
        System.out.println("this is targetable method!");
    }

}
