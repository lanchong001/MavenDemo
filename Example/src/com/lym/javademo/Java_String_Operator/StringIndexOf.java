package com.lym.javademo.Java_String_Operator;

/**
 * 字符串搜索
 * Created by lym on 2016/7/9.
 */
public class StringIndexOf {
    //使用了 String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，
    // 如过存在返回字符串出现的位置（第一位为0），
    // 如果不存在返回 -1：

    public static void main(String[] args){
        String strOrig = "Hello readers,Hello everyone";
        int intIndex = strOrig.indexOf("Hello");

        //String.indexOf(str)  查找str在字符串String中第一次出现的位置

        if(intIndex == -1)
        {
            System.out.println("Hello not found");
        }
        else
        {
            System.out.println("Found Hello at index "  + intIndex);
        }
    }
}
