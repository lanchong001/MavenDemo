package com.lym.javademo.Java_Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合长度
 * Created by lym on 2016/7/10.
 */
public class HashSetCollectionSize {
    //如何使用 Collections 类 的collection.add() 来添加数据并使用 collection.size()来计算集合的长度

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        System.out.println( "集合实例!\n" );

        /*
            HashMap 与 HashSet 的区别:
            1、HashMap实现了Map接口，HashSet实现了Set接口
            2、HashMap储存键值对，HashSet仅仅存储对象
            3、HashMap使用put()方法将元素放入map中，HashSet使用add()方法将元素放入set中
            4、HashMap中使用键对象来计算hashcode值，HashSet使用成员对象来计算hashcode值，对于两个对象来说hashcode可能相同，所以equals()方法用来判断对象的相等性，如果两个对象不同的话，那么返回false
            5、HashMap比较快，因为是使用唯一的键来获取对象,HashSet较HashMap来说比较慢
        */


        //初始化 HashSet 对象
        HashSet collection = new HashSet();
        collection.add("Yellow");
        collection.add("White");
        collection.add("Green");
        collection.add("Blue");
        System.out.print("集合数据: ");

        //获取集合的迭代器
        Iterator iterator = collection.iterator();
        //判断下一个元素是否为空
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");  //输出下一个元素
        }
        System.out.println();
        if (collection.isEmpty()){  //判断是否是否为空
            System.out.println("集合是空的");
        }
        else{
            //获取集合的长度
            System.out.println( "集合长度: " + collection.size());
        }
        System.out.println();
    }
}
