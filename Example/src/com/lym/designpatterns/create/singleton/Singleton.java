package com.lym.designpatterns.create.singleton;

/**
 * Created by lym on 2017/3/11.
 */
public class Singleton {

    private static Singleton instance;

    //定义private的构造方法，外部就不能new Singleton()进行实例化了
    private Singleton()
    {

    }

//    //外部获取本类实例的唯一全局访问点
//    public static  Singleton GetInstance()
//    {
//        //若实例不存在,则返回一个全新的实例，否则返回已有的实例
//        if(instance == null)
//        {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //线程安全

    //将实体类的初始化进行加锁
    private static  synchronized void init()
    {
        if(instance == null)
            instance = new Singleton();
    }

    public  static Singleton GetInstance()
    {
        if(instance == null)
        {
            init();
        }
        return instance;
    }

}
