package com.lym.javademo.Java_Collection;

import java.util.*;

/**
 * 集合遍历
 * Created by lym on 2016/7/11.
 */
public class ArrayListHashSetFor {
    //如何遍历从Collection接口延伸出的List、Set和以键值对形式作存储的Map类型的集合?
    //1、普通for循环
    //2、增强型的 for 循环 foreach
    //3、iterator 迭代器

    public static void main(String[] args){
        // List集合的遍历
        listTest();
        // Set集合的遍历
        setTest();
    }


    private static void setTest(){
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        // 重复数据添加失败
        System.out.println("重复添加 JAVA,结果为: " + set.add("JAVA"));
        set.add("JAVASCRIPT");

        // 使用iterator遍历
        System.out.println("使用iterator遍历");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 使用增强for循环进行遍历
        System.out.println("使用增强for循环进行遍历");
        for(String s : set){
            System.out.println(s);
        }

//        for(int i = 0; i < set.size(); i++){
//            System.out.println(set.);
//        }   //没有对应的get元素的方法
    }

    private static void listTest(){

        List<String> list = new ArrayList<String>();
        list.add("你");
        list.add("好");
        list.add("吗");
        list.add("码农");

        // 使用iterator遍历
        System.out.println("使用iterator遍历");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用传统for循环进行遍历
        System.out.println("使用传统for循环进行遍历");
        for (int i = 0, size = list.size(); i < size; i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        // 使用增强for循环进行遍历
        System.out.println("使用增强for循环进行遍历");
        for (String value : list) {
            System.out.println(value);
        }
    }
}
