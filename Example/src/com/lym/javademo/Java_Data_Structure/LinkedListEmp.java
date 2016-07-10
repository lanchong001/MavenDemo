package com.lym.javademo.Java_Data_Structure;

import java.util.LinkedList;

/**
 * 在链表（LinkedList）的开头和结尾添加元素
 * 获取链表（LinkedList）的第一个和最后一个元素
 * 删除链表中的元素
 * 链表元素查找
 * 链表修改
 * Created by lym on 2016/7/10.
 */
public class LinkedListEmp {

    /*
        ArrayList、LinkedList、Vector 3者区别：
        Vector: 底层数据结构也是数组结构,线程安全，查询数据慢,插入数据慢
        ArrayList: 底层数据结构也是数组结构,线程不安全，查询数据快
        LinkedList: 底层数据结构是 链表结构。对元素的增删速度很快。但是查询速度很慢。线程是不安全的。
    */
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        LinkedList lList = new LinkedList();
        lList.offer("1");
        lList.offer("2");
        lList.offer("3");
        lList.offer("4");
        lList.offer("5");

        //如何使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素
        System.out.println(lList);
        // lList.addFirst("0") 在链表头部添加一个元素0
        lList.addFirst("0");
        System.out.println(lList);
        // lList.addLast("6") 在链表末尾添加一个元素6
        lList.addLast("6");
        System.out.println(lList);

        //如何使用 LinkedList 类的 lList.getFirst() 和 lList.getLast() 来获取链表的第一个和最后一个元素
        // lList.getFirst() 获取链表的第一个元素
        System.out.println("链表的第一个元素是：" + lList.getFirst());
        // lList.getLast() 获取链表的最后一个元素
        System.out.println("链表的第二个元素是：" + lList.getLast());

        //使用 Clear() 方法来删除链表中的元素
        //public List<E> subList(int fromIndex, int toIndex)
        //获取当前链表中的第fromIndex到toIndex之间(包括fromIndex但不包括toIndex)的元素组成的子链表
        lList.subList(2, 4).clear();
        System.out.println(lList);

        //使用 lList.indexof(element) 和 lList.Lastindexof(elementname) 方法在链表中获取元素第一次和最后一次出现的位置
        System.out.println("元素 1 第一次出现的位置：" + lList.indexOf("1"));
        System.out.println("元素 5 最后一次出现的位置："+ lList.lastIndexOf("5"));

        //使用 lList.add() 和 lList.set() 方法来修改链接中的元素
        LinkedList officers = new LinkedList();
        officers.offer("B");  //添加链表元素
        officers.offer("B");
        officers.offer("T");
        officers.offer("H");
        officers.offer("P");
        System.out.println(officers);

        //officers.set(2, "M"); 将索引位置为2的元素赋值为'M'  T换成M
        officers.set(2, "M");
        System.out.println(officers);
    }
}
