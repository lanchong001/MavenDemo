package com.lym.javademo.Java_Thread;

/**
 * 线程优先级设置
 * Created by lym on 2016/7/18.
 */
public class ThreadSetPriority extends Thread {
    //如何通过setPriority() 方法来设置线程的优先级
    private  int countDown = 5;
    private volatile double d = 5;

    public ThreadSetPriority(int priority)
    {
        setPriority(priority);  //设置优先级
        start();   //启动线程
    }

    public String toString()
    {
        return super.toString() + " : " + countDown;
    }

    public void run(){
        while (true){
            for(int i = 1; i < 100000; i++)
                d = d + (Math.PI + Math.E) / (double)i;
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        new ThreadSetPriority(Thread.MAX_PRIORITY);
        for(int i = 0; i < 5; i++)
            new ThreadSetPriority(Thread.MIN_PRIORITY);
    }
}
