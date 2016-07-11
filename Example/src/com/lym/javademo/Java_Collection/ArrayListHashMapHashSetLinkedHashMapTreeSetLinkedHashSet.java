package com.lym.javademo.Java_Collection;

import java.util.*;

/**
 * 集合中添加不同类型元素
 * Created by lym on 2016/7/11.
 */
public class ArrayListHashMapHashSetLinkedHashMapTreeSetLinkedHashSet {

    /*
        Set：无序、不可重复的集合。
        List：有序，可重复的集合。
        Map：具有映射关系的集合。
        Collection 接口是 List、Set 和 Queue 接口的父接口，

        hashset:HashSet会调用该对象的 hashCode() 方法来得到该对象的hashCode值，然后根据hashCode值决定该对象在HashSet中的存储位置
        treeset:SortedSet接口的实现类，TreeSet可以确保集合元素处于排序状态。
        linkedhashset:LinkedHashSet内部使用散列以加快查询速度，同时使用链表维护元素插入的次序，在使用迭代器遍历Set时，结果会按元素插入的次序显示。
    */

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List lnkLst = new LinkedList();
        lnkLst.add("element1");   // LinkedList 类型 添加元素
        lnkLst.add("element2");
        lnkLst.add("element3");
        lnkLst.add("element4");
        displayAll(lnkLst);
        List aryLst = new ArrayList();
        aryLst.add("x");    // ArrayList 类型 添加元素
        aryLst.add("y");
        aryLst.add("z");
        aryLst.add("w");
        displayAll(aryLst);
        Set hashSet = new HashSet();
        hashSet.add("set1");    // HashSet 类型 添加元素
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        displayAll(hashSet);
        SortedSet treeSet = new TreeSet();
        treeSet.add("1");       // TreeSet 类型 添加元素
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        displayAll(treeSet);
        LinkedHashSet lnkHashset = new LinkedHashSet();
        lnkHashset.add("one");  // LinkedHashSet 类型 添加元素
        lnkHashset.add("two");
        lnkHashset.add("three");
        lnkHashset.add("four");
        displayAll(lnkHashset);
        Map map1 = new HashMap();
        map1.put("key1", "J");  // HashMap 类型 添加元素
        map1.put("key2", "K");
        map1.put("key3", "L");
        map1.put("key4", "M");
        displayAll(map1.keySet());
        displayAll(map1.values());
        SortedMap map2 = new TreeMap();
        map2.put("key1", "JJ"); // SortedMap 类型 添加元素
        map2.put("key2", "KK");
        map2.put("key3", "LL");
        map2.put("key4", "MM");
        displayAll(map2.keySet());
        displayAll(map2.values());
        LinkedHashMap map3 = new LinkedHashMap();
        map3.put("key1", "JJJ");    // LinkedHashMap 类型 添加元素
        map3.put("key2", "KKK");
        map3.put("key3", "LLL");
        map3.put("key4", "MMM");
        displayAll(map3.keySet());
        displayAll(map3.values());
    }
    static void displayAll(Collection col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
