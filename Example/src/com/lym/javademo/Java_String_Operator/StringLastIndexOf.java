package com.lym.javademo.Java_String_Operator;

/**
 * 查找字符串最后一次出现的位置
 * Created by lym on 2016/7/9.
 */
public class StringLastIndexOf {
    //通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置

    public static void main(String[] args){
        String strOrig = "Hello World ,Hello Reader";
        //int lastIndex = strOrig.lastIndexOf("wello");
        int lastIndex = strOrig.lastIndexOf("wello");

        //String.lastIndexOf(str) 查找字符串str最后出现的位置;
        // 如果没找到返回-1
        // 如果能找到，返回位置下标

        if(lastIndex == -1)
        {
            System.out.println("Hello not found");
        }
        else
        {
            System.out.println("Last occurrence of Hello is at index "+ lastIndex);
        }

    }
}
