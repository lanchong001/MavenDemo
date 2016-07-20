package com.lym.javademo.Java_Thread;

/*
ava中原来在Thread中提供了stop()方法来终止线程，但这个方法是不安全的，所以一般不建议使用。
这里使用interrupt方法中断线程。
使用interrupt方法来终端线程可分为两种情况：
（1）线程处于阻塞状态，如使用了sleep方法。
（2）使用while（！isInterrupted（））{……}来判断线程是否被中断。
在第一种情况下使用interrupt方法，sleep方法将抛出一个InterruptedException例外，而在第二种情况下线程将直接退出。
*/


/**
 * 终止线程
 * Created by lym on 2016/7/21.
 */
public class ThreadInterrupt extends Thread {
    public void run(){
        //方法1：
//        try
//        {
//            sleep(5000);
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println(e.getMessage());
//        }

        //方法2:
        int i = 0;
        while (!isInterrupted()){
            System.out.println(i++);
        }

    }

    public static void main(String[] args) throws Exception{
        Thread thread = new ThreadInterrupt();
        thread.start();
        //System.out.println("在50秒之内按任意键中断线程");
        System.out.println("按任意键中断线程");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出");
    }
}
