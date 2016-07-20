package com.lym.javademo.Java_Thread;

/**
 * 线程挂起
 * Created by lym on 2016/7/21.
 */
public class SleepingThread extends Thread  {
    //如何将线程挂起

    private int countDown = 5;
    private static int threadCount = 0;
    public SleepingThread(){
        super(" " + threadCount);
        start();
    }

    public String toString(){
        return "#" + getName() + ": " + countDown;
    }

    public void run(){
        while(true){
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
            try
            {
                sleep(100);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        for(int i = 0; i < 5; i++){
            new SleepingThread().join();
        }
        System.out.println("线程已被挂起");
    }
}
