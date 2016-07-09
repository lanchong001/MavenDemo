package com.lym.javademo.Java_Array_Operator;

import java.util.Arrays;

/**
 * 数组填充
 * Created by lym on 2016/7/9.
 */
public class ArraysFill {
    //通过 Java Util 类的 Array.fill(arrayname,value) 方法和 Array.fill(arrayname ,starting index ,ending index ,value) 方法向数组中填充元素

    public static void main(String args[]) {
        int array[] = new int[6];

        //将100填充到array数组的所有元素
        Arrays.fill(array, 100);
        for (int i=0, n=array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        //将数组array中下标第3到第5的元素的值填充为50
        Arrays.fill(array, 3, 6, 50);
        for (int i=0, n=array.length; i< n; i++) {
            System.out.println(array[i]);
        }
    }
}
