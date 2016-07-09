package com.lym.javademo.Java_String_Operator;

/**
 * 字符串性能比较测试
 * Created by lym on 2016/7/9.
 */
public class StringComparePerformance {
    //通过两种方式创建字符串，并测试其性能
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s1 = "hello";  //通过 String 关键词创建字符串
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键词创建字符串" + " : "+ (endTime - startTime) + " 毫秒" );
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3 = new String("hello");  //通过 String 对象创建字符串
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串" + " : " + (endTime1 - startTime1) + " 毫秒");
    }
}
