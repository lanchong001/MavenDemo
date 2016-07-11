package com.lym.javademo.Java_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 循环移动元素
 * Created by lym on 2016/7/11.
 */
public class CollectionsRotate {
    //如何使用 Collections 类的 rotate() 来循环移动元素，方法第二个参数指定了移动的起始位置
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List :" + list);
        //public static void rotate(List<?> list, int distance)
        Collections.rotate(list, 3);  //将list的起始元素之后的第3个元素设置为第一个元素
        System.out.println("rotate: " + list);
    }
}
