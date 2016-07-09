package com.lym.javademo.Java_String_Operator;

/**
 * 字符串比较
 * Created by lym on 2016/7/9.
 */
public class StringCompareTo {
    //通过字符串函数 compareTo (string) ，compareToIgnoreCase(String) 及 compareTo(object string) 来比较两个字符串，并返回字符串中第一个字母ASCII的差值
    public static void main(String args[]){
        String str = "Hello World";
        String anotherStr = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anotherStr));  //区分大小写，进行比较
        System.out.println(str.compareToIgnoreCase(anotherStr));  //忽略大小写，进行比较
        System.out.println(str.compareTo(objStr.toString()));

        /*   H比h的ASCII值相差32
        -32
        0
        0
        */
    }
}
