package com.lym.javademo.Java_Data_Structure;

import java.util.Collections;
import java.util.Vector;

/**
 * 获取向量元素的索引值/向量相关的操作
 * 获取向量的最大元素
 * 旋转向量
 * Created by lym on 2016/7/10.
 */
public class VectorEmp {
    //使用 Collections 类的 sort() 方法对向量进行排序并使用 binarySearch() 方法来获取向量元素的索引值

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        /*
            向量（Vector）类和传统数组非常相似，但是Vector的大小能根据需要动态的变化。
            和数组一样，Vector对象的元素也能通过索引访问。
            使用Vector类最主要的好处就是在创建对象的时候不必给对象指定大小，它的大小会根据需要动态的变化。
        */
        Vector v = new Vector();  //初始化定义Vector对象
        v.add("X");
        v.add("M");  //添加向量元素
        v.add("D");
        v.add("A");
        v.add("O");
        //Collections.sort(v) 对向量中的元素进行排序
        Collections.sort(v);
        // public static <T extends Comparable<? super T>> void sort(List<T> list)
        // 对于所有的集合，如果集合中的元素或者对象的类实现了Comparable接口，则都可以进行排序

        System.out.println(v);
        //Collections.binarySearch(v, "D"); 查找元素D在向量v中的索引位置
        int index = Collections.binarySearch(v, "D");
        // 对于所有的集合，如果集合中的元素或者对象的类实现了Comparable接口，则都可以进行元素查找

        System.out.println("元素D在Vector中的索引值为 : " + index);

        //使用 Vector 类的 v.add() 方法及 Collection 类的 Collections.max() 来获取向量的最大元素
        Vector ve = new Vector();
        ve.add(new Double("3.4324"));
        ve.add(new Double("3.3532"));
        ve.add(new Double("3.342"));
        ve.add(new Double("3.349"));
        ve.add(new Double("2.3"));

        //Collections.max(ve) 获取向量ve中最大的元素
        Object obj = Collections.max(ve);
        System.out.println("Vector ve 总最大元素是：" + obj);

        //使用 swap() 函数来旋转向量
        Vector vec = new Vector();
        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        vec.add("5");
        System.out.println(vec);

        //Collections.swap(vec, 0, 4) 将向量vec中索引0的元素与索引4的元素的值进行互换
        Collections.swap(vec, 0, 4);
        System.out.println("旋转后");
        System.out.println(vec);

    }
}
