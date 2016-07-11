package com.lym.javademo.Java_Collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 遍历 HashTable 的键值
 * 使用 Enumeration 遍历 HashTable
 * Created by lym on 2016/7/11.
 */
public class HashTableEmp {
    //如何使用 Hashtable 类的 keys() 方法来遍历输出键值

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        Hashtable tb = new Hashtable();
        tb.put(1,"One");   //添加元素
        tb.put(2,"Two");
        tb.put(3,"Three");

        //Enumeration 和 Iterator 都可以遍历集合类的实例
        // Enumeration  先进后出
        // iterator     先进先出
        //Enumeration 旧接口尽管没有被摈弃，但已经被Iterator（迭代器）所替代。
        //Enumeration接口只有hasMoreElements 和 nextElement两个方法

        //如何使用 Enumeration 类的 hasMoreElements 和 nextElement 方法来遍历输出 HashTable 中的内容
        Enumeration e = tb.keys();
        while(e.hasMoreElements()){  //是否有多个元素
            System.out.println(e.nextElement());   //获取下一个元素
        }
    }
}
