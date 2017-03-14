package com.lym.designpatterns.structural.adapter;

/**
 * Created by lym on 2017/3/14.
 */
public class AdapterTest {
    public static void main(String[] args)
    {
        ITargetable target = new Adapter();
        target.method1();
        target.method2();

        //实现了ITargetable的实例，具有Source类的功能

        Source source = new Source();
        ITargetable ObjTargetable = new Warpper(source);
        ObjTargetable.method1();
        ObjTargetable.method2();
        //实现类ITargable的实例,并且持有Source类的对象

        ISourceable sourceable = new SourceSub();
        sourceable.method1();
        sourceable.method2(); //没有任何输出(只在抽象方法里面实现,实际接口的适配器类中没有实现)

    }
}
