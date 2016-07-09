package com.lym.javademo.Java_String_Operator;

/**
 * 字符串优化  //不能优化，提交赋值速度
 * Created by lym on 2016/7/9.
 */
public class StringIntern {
    //通过 String.intern() 方法来优化字符串
    public static void main(String[] args){
        String variables[] = new String[50000];
        for( int i=0;i <50000;i++){
            variables[i] = "s"+i;
        }
        long startTime0 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Creation time of String literals : "+ (endTime0 - startTime0) + " ms" );
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Creation time of String objects with 'new' key word : " + (endTime1 - startTime1) + " ms");
        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            //variables[i] = new String("hello");
            variables[i] = variables[i].intern();

            //String的intern()方法就是扩充常量池的一个 方法；
            // 当一个String实例str调用intern()方法时，Java查找常量池中是否有相同Unicode的字符串常量，
            // 如果有，则返回其的引用，
            // 如果没有，则在常量池中增加一个Unicode等于str的字符串并返回它的引用；
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Creation time of String objects with intern(): " + (endTime2 - startTime2) + " ms");
    }
}
