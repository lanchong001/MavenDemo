package com.lym.javademo.Java_Data_Structure;

/**
 * 数字求和运算
 * Created by lym on 2016/7/10.
 */
public class Sum {
    //使用do...while结构求0~100的整数数字之和
    public static void main(String[] args){
        int limit = 100;
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }
        while (i <= limit);
        System.out.println(" 0 ~ 100 Sum = " + sum);
    }
}
