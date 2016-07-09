package com.lym.javademo.Java_Array_Operator;

/**
 * 数组扩容
 * Created by lym on 2016/7/9.
 */
public class ArrayCapacityExpansion {
    //如何在数组初始化后对数组进行扩容
    public static void main(String[] args) {
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];   //初始化一个大的数据
        extended[3] = "D";  //给扩容的数组元素赋值
        extended[4] = "E";

        //将原数组中的所有元素拷贝到新数组中
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended){
            System.out.println(str);
        }
    }
}
