package com.lym.javademo.Java_Data_Structure;

/**
 * 数组实现的栈/栈的实现
 * 压栈出栈的方法实现字符串反转
 * Created by lym on 2016/7/10.
 */
public class ArrayStack {
    //如何通过创建用于插入元素的自定义函数 push() 方法和用于弹出元素的 pop() 方法来实现栈
    private int maxSize;
    private long[] stackArray;
    private int top;

    //设置栈的大小、容器、及顶部的位置
    public ArrayStack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    //入栈
    public void push(long j){
        stackArray[++top] = j;
    }

    //出栈
    public long pop()
    {
        return stackArray[top--];
    }

    //获取栈顶元素
    public long peek(){
        return stackArray[top];
    }

    //判断是否栈空
    public boolean isEmpty() {
        return (top == -1);
    }

    //判断是否栈满
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        ArrayStack theStack = new ArrayStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}

