package com.lym.javademo.Java_Method;

/*
波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
特别指出：第0项是0，第1项是第一个1。
这个数列从第三项开始，每一项都等于前两项之和。
*/
/**
 * 斐波那契数列
 * Created by lym on 2016/7/10.
 */
public class FibonacciSequence {

    public static void main(String[] args){
        for(int counter = 0; counter <= 10; counter++){
            System.out.printf("Fibonacci of %d is : %d\n", counter, fibonacci(counter));
        }

        //System.out.printf()   按特定的格式输入文本
        //System.out.println()  不支持格式
    }

    public static long fibonacci(long number){
        if(number == 0 || number == 1)
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
