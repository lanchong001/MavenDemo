package com.lym.javademo.Java_String_Operator;

/**
 * 删除字符串中的一个字符
 * Created by lym on 2016/7/9.
 */
public class StringRemoveCharAt {
    //通过字符串函数 substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中
    public static void main(String[] args){
        String str = "this is Java";
        System.out.println(removeCharAt(str,3));
    }

    public static String removeCharAt(String s,int pos)
    {
        return s.substring(0,pos) + s.substring(pos+1);

        //  String.substring(beginIndex,endIndex)  //返回当前字符串中从beginIndex到endIndex之间的字符组成的字符串
        //  String.substring(beginIndex)    //返回当前字符串中虫beginIndex开始直到字符串末尾间的字符组成的字符串
    }

}
