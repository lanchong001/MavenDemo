package com.lym.javademo.Java_Thread;

/*
Java中的线程的生命周期大体可分为5种状态。
    1. 新建状态（New）：新创建了一个线程对象。
    2. 就绪状态（Runnable）：线程对象创建后，其他线程调用了该对象的start()方法。该状态的线程位于可运行线程池中，变得可运行，等待获取CPU的使用权。
    3. 运行状态（Running）：就绪状态的线程获取了CPU，执行程序代码。
    4. 阻塞状态（Blocked）：阻塞状态是线程因为某种原因放弃CPU使用权，暂时停止运行。直到线程进入就绪状态，才有机会转到运行状态。阻塞的情况分三种：
    （一）、等待阻塞：运行的线程执行wait()方法，JVM会把该线程放入等待池中。
    （二）、同步阻塞：运行的线程在获取对象的同步锁时，若该同步锁被别的线程占用，则JVM会把该线程放入锁池中。
    （三）、其他阻塞：运行的线程执行sleep()或join()方法，或者发出了I/O请求时，JVM会把该线程置为阻塞状态。当sleep()状态超时、join()等待线程终止或者超时、或者I/O处理完毕时，线程重新转入就绪状态。
    5. 死亡状态（Dead）：线程执行完了或者因异常退出了run()方法，该线程结束生命周期。
*/

/**
 * 状态监测
 * Created by lym on 2016/7/18.
 */
class TestGetState extends Thread {
    boolean waiting = true;
    boolean ready = false;

    TestGetState(){}

    public void run(){
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + " starting. ");
        while(waiting)
            System.out.println("waiting : " + waiting);
        System.out.println("waiting...");
        startWait();
        try {
            Thread.sleep(1000);
        }
        catch(Exception exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }

    synchronized void startWait(){
        try{
            while(!ready)
                wait();
        }
        catch (InterruptedException ex)
        {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice(){
        ready = true;
        notify();
    }
}

public class ThreadGetState {
    public static void main(String[] args) throws Exception {
        TestGetState thrd = new TestGetState();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while(thrd.isAlive())
            System.out.println("alive");
        showThreadStatus(thrd);
    }

    // thrd.isAlive() 获取线程是否存活
    // thrd.getState() 获取线程状态
    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive:=" + thrd.isAlive() + " State:=" + thrd.getState());
    }

    /*
        线程的状态:
        State.NEW:新建状态
        State.RUNNABLE:就绪状态
		State.BLOCKED:阻塞状态
		State.WAITING:条件唤醒
		State.TIMED_WAITING:定时唤醒
		State.TERMINATED: 线程执行完毕或异常退出会进入终止状态

		线程操作：
		start(); 启动
		stop(); 终止
		suspend(); 挂起
		resume(); 恢复
		wait(); 等待
		notify(); 通知
    */
}
