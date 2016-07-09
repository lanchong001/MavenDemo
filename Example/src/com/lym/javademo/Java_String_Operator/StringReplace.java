package com.lym.javademo.Java_String_Operator;

/**
 * 字符串替换
 * Created by lym on 2016/7/9.
 */
public class StringReplace {
    //如何使用java替换字符串中的字符呢？使用 java String 类的 replace 方法来替换字符串中的字符
    public static void main(String[] args){
        String str = "Hello World ,Hello Everyone";
        System.out.println(str.replace('H','W'));
        System.out.println(str.replaceFirst("He","Wa"));
        System.out.println(str.replaceAll("He", "Ha") );

        //String.replace(oldChar, newChar)   //将字符串中oldChar替换成newChar
        //String.replaceFirst(oldStr, newStr)   //将字符串中第一次匹配的oldStr替换成newStr
        //String.replaceAll(oldStr, newStr)  //将字符串中所有匹配的oldStr替换成newStr

    }
}
