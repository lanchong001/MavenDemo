package com.lym.javademo.Java_Method;

/**
 * continue 关键字用法
 * Java continue 语句语句用来结束当前循环，并进入下一次循环，
 * 即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行。
 * Created by lym on 2016/7/10.
 */
public class ContinueEmp {
    public static void main(String[] args){
        StringBuffer searchStr = new StringBuffer("hello,how are you. ");
        int length = searchStr.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (searchStr.charAt(i) != 'h')
                continue;
            count++;

            //StringBuffer.setCharAt(i, 'H')  将第i个字符设置为'H'
            searchStr.setCharAt(i, 'H');
        }
        System.out.println("发现 " + count + " 个 h 字符");
        System.out.println(searchStr);
    }
}
