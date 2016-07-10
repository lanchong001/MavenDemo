package com.lym.javademo.Java_Data_Structure;

import java.util.LinkedList;

/**
 * 由链表实现的栈/获取链表的元素
 * Created by lym on 2016/7/10.
 */
public class LinkedListStack {
    //使用 top() 和 pop() 方法来获取链表的元素

    private LinkedList list = new LinkedList();

    //入栈
    @SuppressWarnings("unchecked")
    public void push(Object v)
    {
        //list.addFirst(v) 添加第一个元素
        list.addFirst(v);
    }

    //出栈
    public Object pop()
    {
        //list.removeFirst() 删除第一个元素
        return list.removeFirst();
    }

    //获取第一个元素
    public Object top()
    {
        //list.getFirst() 获取第一个元素
        return list.getFirst();
    }

    public static void main(String[] args)
    {
        LinkedListStack stack = new LinkedListStack();
        for(int i=30; i<40; i++){
            stack.push(i);
        }
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
