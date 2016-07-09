package com.lym.javademo.Java_Array_Operator;

/**
 * 数组输出
 * Created by lym on 2016/7/9.
 */
public class PrintArray {
    //如何通过循环输出数组
    public static void main(String[] args){
        String[] greeting = new String[3];
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";
        for (int i = 0; i < greeting.length; i++){
            System.out.println(greeting[i]);
        }
    }
}
