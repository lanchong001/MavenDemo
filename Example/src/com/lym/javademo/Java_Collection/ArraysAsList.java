package com.lym.javademo.Java_Collection;




import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 * 集合转数组
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
        System.out.println();

        //list.toArray(new String[list.size()]) 将一个list集合转换成为与集合长度一样大小的数组
        String[] newNames = list.toArray(new String[list.size()]);

        //System.out.println(String.format("%s,%s,%s", newNames));  //必须按照数组长度显示百分号

        System.out.println("ArrayToStringJoin " + ArrayToStringJoin(newNames, ","));
        // StringUtils.join(newNames, ",") 数组转字符串,按","进行分割
        System.out.println("StringUtils.join(newNames, \",\") " + StringUtils.join(newNames, ","));
    }

    private static String ArrayToStringJoin(String[] array, String join)
    {
        String result = "";
        if(array != null && array.length > 0)
        {
            int length = array.length;
            String format = "";
            for (String anArray : array) {
                format += "%s" + join;
            }
            result = String.format(format,array);
            result = result.substring(0,result.length() -1);
        }
        return result;
    }
}
