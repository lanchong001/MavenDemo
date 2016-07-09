package com.lym.javademo.Java_String_Operator;

/**
 * 连接字符串
 * Created by lym on 2016/7/9.
 */
public class StringBufferAppend {
    //通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<500000;i++){
            String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接 - 使用 + 操作符 : " + (endTime - startTime)+ " ms");
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<500000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接 - 使用 StringBuffer : " + (endTime1 - startTime1)+ " ms");

        /*
            字符串连接 - 使用 + 操作符 : 2 ms
            字符串连接 - 使用 StringBuffer : 245 ms
            使用 + 比 StringBuffer.append() 的性能好
        */
    }
}
