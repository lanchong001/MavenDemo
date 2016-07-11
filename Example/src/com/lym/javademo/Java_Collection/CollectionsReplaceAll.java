package com.lym.javademo.Java_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 元素替换
 * Created by lym on 2016/7/11.
 */
public class CollectionsReplaceAll {
    //如何使用 Collections 类的 replaceAll() 来替换List中所有的指定元素
    public static void main(String[] args){
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List : "+list);

        //public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal)
        Collections.replaceAll(list, "one", "hundread");  //将list中的所有 one 替换成 hundread
        System.out.println("replaceAll: " + list);
    }
}
