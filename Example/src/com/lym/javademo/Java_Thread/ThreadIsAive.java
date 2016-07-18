package com.lym.javademo.Java_Thread;

/**
 * 查看线程是否存活
 * 获取当前线程名称
 * Created by lym on 2016/7/18.
 */
public class ThreadIsAive extends Thread {
    //如何通过继承Thread类并使用currentThread()方法来检测一个线程是否存活

    public void run()
    {
        for(int i = 0; i < 10; i++){
            printMsg();
        }
    }

    //如何通过继承 Thread 类并使用 getName() 方法来获取当前线程名称：
    public void printMsg()
    {
        Thread t = Thread.currentThread();  //获取当前线程
        String name = t.getName();  //获取线程名称
        System.out.println("name = " + name);
    }

    public static void main(String[] args){
        ThreadIsAive aive = new ThreadIsAive();
        aive.setName("sub Thread");   //设置子线程名称
        System.out.println("before start(), tt.isAlive()=" + aive.isAlive());  //判断线程是否存活
        aive.start();  //开始启动线程
        System.out.println("just after start(), tt.isAlive()=" + aive.isAlive());
        for (int i = 0; i < 10; i++) {
            aive.printMsg();
        }
        System.out.println("The end of main(), tt.isAlive()=" + aive.isAlive());
    }
}
