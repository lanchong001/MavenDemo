package com.lym.javademo.Java_String_Operator;

/**
 * 字符串小写转大写
 * Created by lym on 2016/7/9.
 */
public class StringToUpperCase {
    //使用了 String toUpperCase() 方法将字符串从小写转为大写
    public static void main(String[] args){
        String str = "hello world,hello everyone";
        String strUpper = str.toUpperCase();

        //str.toUpperCase()  返回一个转换成大写的字符串

        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: " + strUpper);
    }
}
