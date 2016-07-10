package com.lym.javademo.Java_Data_Structure;

import java.io.IOException;

/**
 * 压栈出栈的方法实现字符串反转/通过字符数据实现的栈来实现字符串反转
 * Created by lym on 2016/7/10.
 */
public class StringReverseThroughStack {

    public static void main(String[] args) throws IOException {
        String input = "hello world,hello everyone";
        String output;
        StringReverseThroughStack stack = new StringReverseThroughStack(input);
        output = stack.reverse();
        System.out.println("反转前： " + input);
        System.out.println("反转后： " + output);

        output = stack.doRev();
        System.out.println("反转前： " + input);
        System.out.println("反转后： " + output);
    }

    private String input;
    private String output;
    public StringReverseThroughStack(String input)
    {
        this.input = input;
    }

    public String doRev() {
        int stackSize = input.length();
        charArrayStack theStack = new charArrayStack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }

    //反转方法实现
    public String reverse()
    {
        int length = this.input.length();
        charArrayStack stack = new charArrayStack(length);
        for(char c :this.input.toCharArray())
        {
            stack.push(c);
        }
        char[] result = new char[length];
        int index = 0;
        while (!stack.isEmpty())
        {
            result[index++] = stack.pop();
        }
        //char[] 转 String 只能使用 String.valueOf(char[])  或者 new String(char[])
        //return String.valueOf(result);
        return new String(result);
        //注意这里不能 result.toString() 这样转换错误
    }
}

class charArrayStack{
    private int maxSize;
    private char[] stackArray;
    private int top;
    public charArrayStack(int max)
    {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }


}
