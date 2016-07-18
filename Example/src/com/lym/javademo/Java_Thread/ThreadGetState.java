package com.lym.javademo.Java_Thread;

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
