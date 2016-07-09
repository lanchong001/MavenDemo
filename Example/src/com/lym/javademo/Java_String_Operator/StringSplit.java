package com.lym.javademo.Java_String_Operator;

/**
 * 字符串分割
 * Created by lym on 2016/7/9.
 */
public class StringSplit {
    //使用了 split(string) 方法通过指定分隔符将字符串分割为数组
    public static void main(String[] args){
        String str = "www-lym-com";
        String[] temp;
        String delimeter = "-";  // 指定分割字符
        temp = str.split(delimeter); // 分割字符串

        //String.split(str)  按str将字符串String分割成一个字符串数组

        // 普通 for 循环
        for(int i =0; i < temp.length ; i++){
            System.out.print(temp[i]);
            System.out.print(".");
        }
        System.out.println();

        System.out.println("------java for each循环输出的方法-----");
        String str1 = "www.lym.com";
        String[] temp1;
        String delimeter1 = "\\.";  // 指定分割字符， . 号需要转义
        temp1 = str1.split(delimeter1); // 分割字符串
        for(String x :  temp1){
            System.out.println(x);
            System.out.println("");
        }
    }
}
