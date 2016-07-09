package com.lym.javademo.Java_Array_Operator;

import java.util.Arrays;

/**
 * 数组排序及元素查找
 * Created by lym on 2016/7/9.
 */
public class ArraysSort {
    //如何使用sort()方法对Java数组进行排序，及如何使用 binarySearch() 方法来查找数组中的元素

    public static void main(String[] args){
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);   //将数组中的元素进行排序
        System.out.println("数组排序结果为 : [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
        int index = Arrays.binarySearch(array, 2);   //查找元素2在数组array中的位置
        System.out.println("元素 2  在第 " + index + " 个位置");
    }
}
