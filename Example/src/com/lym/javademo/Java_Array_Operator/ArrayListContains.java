package com.lym.javademo.Java_Array_Operator;

import java.util.ArrayList;

/**
 * 在数组中是否包含指定元素
 * Created by lym on 2016/7/9.
 */
public class ArrayListContains {
    //如何使用 contains () 方法来查找数组中是否包含指定元素

    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray 的数组元素：" + objArray);
        System.out.println("objArray2 的数组元素：" + objArray2);
        //objArray.contains("common1") 判断集合objArray是否包含"common1"对象
        System.out.println("objArray 是否包含字符串common2? ： " + objArray.contains("common1"));
        //objArray2.contains(objArray) 判断集合objArray2中是否包含objArray对象
        //这里集合中包含集合的用法错误，但是 ArrayList.contains(Object o) 是一个对象，而集合对象也是一个对象，所以语法上不会报错
        System.out.println("objArray2 是否包含数组 objArray? ：" + objArray2.contains(objArray));
    }
}
