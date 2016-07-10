package com.lym.javademo.Java_Method;

/**
 * for 和 foreach循环使用
 * for 语句比较简单，用于循环数据。
    for循环执行的次数是在执行前就确定的。语法格式如下：
         for(初始化; 布尔表达式; 更新) {
            //代码语句
         }
    foreach语句是java5的新特征之一，在遍历数组、集合方面，foreach为开发人员提供了极大的方便。
    foreach 语法格式如下：
         for(元素类型t 元素变量x : 遍历对象obj){
            引用了x的java语句;
         }
 * Created by lym on 2016/7/10.
 */
public class ForEmp {

    public static void main(String[] args) {
        int[] intary = { 1,2,3,4};
        forDisplay(intary);
        foreachDisplay(intary);
    }

    public static void forDisplay(int[] a){
        System.out.println("使用 for 循环数组");
        //  for 语法格式
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void foreachDisplay(int[] data){
        System.out.println("使用 foreach 循环数组");
        //  foreach 语法格式
        for (int a  : data) {
            System.out.print(a+ " ");
        }
    }
}
