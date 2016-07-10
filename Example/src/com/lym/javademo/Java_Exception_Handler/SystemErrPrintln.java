package com.lym.javademo.Java_Exception_Handler;

/**
 * 异常处理方法
 * 获取异常的堆栈信息
 * Created by lym on 2016/7/10.
 */
public class SystemErrPrintln {
    //使用 System 类的 System.err.println() 来展示异常的处理方法
    public static void main(String[] args){
        try
        {
            throw new Exception("My Exception");  //抛出异常
        }
        catch(Exception e)
        {
            System.err.println("Caught Exception");  //输出错误信息
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            //e.getLocalizedMessage() 与 e.getMessage()是相同的结果
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            //使用异常类的 printStackTrace() 方法来获取堆栈信息
            e.printStackTrace();   //打印异常栈，显示详细的异常位置
        }
    }
}
