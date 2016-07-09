package com.lym.javademo.Java_Array_Operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组合并
 * Created by lym on 2016/7/9.
 */
public class ArrayMerge {
    //如何通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组

    public static void main(String args[]) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };

        //Arrays.asList(a) 数组转集合
        List list = new ArrayList(Arrays.asList(a));

        //将list添加到另一个list中
        list.addAll(Arrays.asList(b));

        //list.toArray(); list转数组
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
