package com.lym.javademo.Java_Array_Operator;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组获取最大和最小值
 * Created by lym on 2016/7/9.
 */
public class CollectionsMaxMin {
    //如何通过 Collection 类的 Collection.max() 和 Collection.min() 方法来查找数组中的最大和最小值
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};

        //Collections.min()  获取集合中最小的元素
        //Collections.max()  获取集合中最大的元素

        //Arrays.asList(numbers) 数组转List集合
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
