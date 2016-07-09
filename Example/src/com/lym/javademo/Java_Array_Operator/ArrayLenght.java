package com.lym.javademo.Java_Array_Operator;

/**
 * 获取数组长度
 * Created by lym on 2016/7/9.
 */
public class ArrayLenght {
    //如何使用数组的属性 length 来获取数组的长度


    public static void main(String args[]) {
        String[][] data = new String[2][5];
        System.out.println("第一维数组长度: " + data.length);

        //data.length 数组长度

        System.out.println("第二维数组长度: " + data[0].length);
    }
}
