package com.lym.javademo.Java_Method;

import java.util.ArrayList;
import java.util.Vector;

/**
 * instanceOf 关键字用法
 * instanceof是Java的一个二元操作符，类似于 ==，>，<等操作符。
 * instanceof是Java的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回boolean的数据类型。
 * Created by lym on 2016/7/10.
 */
public class InstanceOfEmp {
    public static void main(String[] args){
        Object obj = new ArrayList();
        displayObjectClass(obj);
    }

    public static void displayObjectClass(Object o){
        if(o instanceof Vector)
            System.out.println("对象是 java.util.Vector 类的实例");
        else if(o instanceof ArrayList)
            System.out.println("对象是 java.util.ArrayList 类的实例");
        else
            System.out.println("对象是 " + o.getClass() + " 类的实例");
    }
}
