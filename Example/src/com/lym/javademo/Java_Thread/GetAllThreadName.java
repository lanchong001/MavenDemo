package com.lym.javademo.Java_Thread;

/**
 * 获取所有线程
 * Created by lym on 2016/7/21.
 */
public class GetAllThreadName extends Thread {
    public static void main(String[] args){
        GetAllThreadName t1 = new GetAllThreadName();
        t1.setName("thread1");
        t1.start();

        //ThreadGroup  线程组就是由线程组成的管理线程的类
        /*
            int activeCount()
            返回此线程组中活动线程的估计数。
            int activeGroupCount()
            返回此线程组中活动线程组的估计数。
            String getName()
            返回此线程组的名称。
            ThreadGroup getParent()
            返回此线程组的父线程组。
            int enumerate(Thread[] list)  把此线程组及其子组中的所有活动线程复制到指定数组中。
        */


        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++)
            System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
    }
}
