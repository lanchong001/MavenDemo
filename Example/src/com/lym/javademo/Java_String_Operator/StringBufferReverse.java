package com.lym.javademo.Java_String_Operator;

/**
 * 字符串反转
 * Created by lym on 2016/7/9.
 */
public class StringBufferReverse {
    //如何使用 Java 的反转函数 reverse() 将字符串反转
    public static void main(String[] args){
        String str = "abcdef";
        String reverseStr = new StringBuffer(str).reverse().toString();

        //通过str初始化一个StringBuffer对象，然后调用初始化的对象进行反转，并返回结果

        System.out.println("\nString before reverse: " + str);
        System.out.println("String after reverse: " + reverseStr);
    }
}
