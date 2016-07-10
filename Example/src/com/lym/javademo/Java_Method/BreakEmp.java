package com.lym.javademo.Java_Method;

/**
 * break 关键字用法
 * Java break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试。
 * Created by lym on 2016/7/10.
 */
public class BreakEmp {
    public static void main(String[] args){
        int[] array = { 99,12,22,34,45,67,5678,8990 };
        int no = 5678;
        int i = 0;
        boolean found = false;
        for ( ; i < array.length; i++) {
            if (array[i] == no) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(no + " 元素的索引位置在: " + i);
        }
        else {
            System.out.println(no + " 元素不在数组总");
        }
    }
}
