package com.lym.javademo.Java_Thread;


/*
为了解决这个问题，我们不使用显示的去锁，我们用信号量去控制。
信号量可以控制资源能被多少线程访问，这里我们指定只能被一个线程访问，就做到了类似锁住。而信号量可以指定去获取的超时时间，我们可以根据这个超时时间，去做一个额外处理。
对于无法成功获取的情况，一般就是重复尝试，或指定尝试的次数，也可以马上退出。
*/

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 死锁及解决方法 ---- 解决方法
 * Created by lym on 2016/7/19.
 */
public class UnLockTest {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";
    public static final Semaphore a1 = new Semaphore(1);    //信号量
    public static final Semaphore a2 = new Semaphore(1);    //信号量

    /*
    Semaphore对象主要方法：
        void  acquire()   从信号量获取一个许可，如果无可用许可前 将一直阻塞等待，
        void acquire(int permits)  获取指定数目的许可，如果无可用许可前  也将会一直阻塞等待
        boolean tryAcquire()   从信号量尝试获取一个许可，如果无可用许可，直接返回false，不会阻塞
        boolean tryAcquire(int permits)   尝试获取指定数目的许可，如果无可用许可直接返回false，
        boolean tryAcquire(int permits, long timeout, TimeUnit unit)   在指定的时间内尝试从信号量中获取许可，如果在指定的时间内获取成功，返回true，否则返回false
        void release()  释放一个许可，别忘了在finally中使用，注意：多次调用该方法，会使信号量的许可数增加，达到动态扩展的效果，如：初始permits 为1， 调用了两次release，最大许可会改变为2
        int availablePermits() 获取当前信号量可用的许可
    */

    public static void main(String[] args) {
        LockAa la = new LockAa();
        new Thread(la).start();
        LockBb lb = new LockBb();
        new Thread(lb).start();
    }
}

class LockAa implements Runnable {
    public void run(){
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                //UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS) 在指定的时间内尝试从信号量中获取许可，如果在指定的时间内获取成功，返回true，否则返回false
                if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockA 锁住 obj1");
                    if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj2");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + "LockA 锁 obj2 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "LockA 锁 obj1 失败");
                }
                UnLockTest.a1.release();    // 释放
                UnLockTest.a2.release();    //释放
                Thread.sleep(1000); // 马上进行尝试，现实情况下do something是不确定的
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class LockBb implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockB 锁住 obj2");
                    if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockB 锁住 obj1");
                        Thread.sleep(60 * 1000); // do something
                    }else{
                        System.out.println(new Date().toString() + "LockB 锁 obj1 失败");
                    }
                }else{
                    System.out.println(new Date().toString() + "LockB 锁 obj2 失败");
                }
                UnLockTest.a1.release(); // 释放
                UnLockTest.a2.release();
                Thread.sleep(10 * 1000); // 这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}