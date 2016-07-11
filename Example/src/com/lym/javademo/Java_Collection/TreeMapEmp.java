package com.lym.javademo.Java_Collection;

import java.util.TreeMap;

/**
 * 集合输出
 * TreeMap 相关的操作
 * Created by lym on 2016/7/11.
 */
public class TreeMapEmp {
    /*
    java为数据结构中的映射定义了一个接口java.util.Map，而HashMap Hashtable和TreeMap就是它的实现类。Map是将键映射到值的对象，一个映射不能包含重复的键；每个键最多只能映射一个一个值。
    Hashmap 是一个最常用的Map,它根据键的HashCode 值存储数据,根据键可以直接获取它的值，具有很快的访问速度。HashMap最多只允许一条记录的键为Null;允许多条记录的值为Null;HashMap不支持线程的同步，即任一时刻可以有多个线程同时写HashMap;可能会导致数据的不一致。如果需要同步，可以用Collections的synchronizedMap方法使HashMap具有同步的能力.
    Hashtable 与 HashMap类似,但是主要有6点不同。
    1.HashTable的方法是同步的，HashMap未经同步，所以在多线程场合要手动同步HashMap这个区别就像Vector和ArrayList一样。
    2.HashTable不允许null值，key和value都不可以,HashMap允许null值，key和value都可以。HashMap允许key值只能由一个null值，因为hashmap如果key值相同，新的key, value将替代旧的。
    3.HashTable有一个contains(Object value)功能和containsValue(Object value)功能一样。
    4.HashTable使用Enumeration，HashMap使用Iterator。
    5.HashTable中hash数组默认大小是11，增加的方式是 old*2+1。HashMap中hash数组的默认大小是16，而且一定是2的指数。
    6.哈希值的使用不同，HashTable直接使用对象的hashCode。
    TreeMap能够把它保存的记录根据键排序,默认是按升序排序，也可以指定排序的比较器，当用Iterator 遍历TreeMap时，得到的记录是排过序的。
    */

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        System.out.println("TreeMap 实例！");
        TreeMap tMap = new TreeMap();
        tMap.put(1, "Sunday");
        tMap.put(2, "Monday");
        tMap.put(3, "Tuesday");
        tMap.put(4, "Wednesday");
        tMap.put(5, "Thursday");
        tMap.put(6, "Friday");
        tMap.put(7, "Saturday");
        System.out.println("TreeMap 键：" + tMap.keySet());  //获取获取键组成的set集合
        System.out.println("TreeMap 值：" + tMap.values());  //获取所有的值集合
        System.out.println("键为 5 的值为: " + tMap.get(5));  //获取key为5的键值
        //tMap.firstKey() 第一个键   tMap.get(tMap.firstKey()) 获取第一个键对应的值
        System.out.println("第一个键: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()));
        System.out.println("最后一个键: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()));
        System.out.println("移除第一个数据: " + tMap.remove(tMap.firstKey())); //通过Key删除第一个元素
        System.out.println("现在 TreeMap 键为: " + tMap.keySet());
        System.out.println("现在 TreeMap 包含: " + tMap.values());
        System.out.println("移除最后一个数据: " + tMap.remove(tMap.lastKey()));
        System.out.println("现在 TreeMap 键为: " + tMap.keySet());
        System.out.println("现在 TreeMap 包含: " + tMap.values());
    }

}
