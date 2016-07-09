package com.lym.javademo.Java_String_Operator;

import java.util.Locale;

/**
 * 字符串格式化
 * Created by lym on 2016/7/9.
 */
public class StringFomat {
    //通过 format() 方法来格式化字符串，还可以指定地区来格式化()
    public static void main(String[] args){
        double e = Math.E;
        System.out.format("%f%n",e);
        System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);  //指定本地为德国（GERMANY）
        String value = String.format("%f%n",e);
        String value1 = String.format(Locale.GERMANY, "%-10.4f%n%n", e); //指定本地为德国（GERMANY）

        //String.format("%f%n",e) 字符串格式化

        System.out.println(value);
        System.out.println(value1);
    }
}
