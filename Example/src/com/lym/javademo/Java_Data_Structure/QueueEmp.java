package com.lym.javademo.Java_Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列（Queue）用法
 * 队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作。先进先出
 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
 * Created by lym on 2016/7/10.
 */
public class QueueEmp {
    public static void main(String[] args){
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");  //从头目添加元素
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");  //从尾部取出第一个入列的元素，并从队列中删除
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }

    }
}
