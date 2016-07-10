package com.lym.javademo.Java_Collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 * Created by lym on 2016/7/10.
 */
public class ArraysAsList {
    //使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合

    public static void main(String[] args) throws IOException {
        int n = 5; //5个元素
        String[] names = new String[n];
        for(int i = 0; i < n; i++){
            names[i] = String.valueOf(i);
        }

        //Arrays.asList(names) 将一个字符串数组 转换成 List<String>集合
        List<String> list = Arrays.asList(names);
        System.out.println();
        for(String li: list){
            System.out.print(li + " ");
        }
    }
}
