package com.lym.designpatterns.create.singleton;

/**
 * Created by lym on 2017/3/11.
 */

public class SingletonTest {
    public static void main(String[] args)
    {
        Singleton s1 = Singleton.GetInstance();
        Singleton s2 = Singleton.GetInstance();
        if(s1 == s2)
        {
            System.out.println("Objects are the same instance");
        }

    }
}
