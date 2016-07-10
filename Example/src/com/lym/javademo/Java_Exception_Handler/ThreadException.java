package com.lym.javademo.Java_Exception_Handler;

/**
 * 多线程异常处理
 * Created by lym on 2016/7/10.
 */
public class ThreadException {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Caught it " + e);
        }
        System.out.println("Exiting main");
    }

    //多线程异常调试
    //http://blog.csdn.net/fuzzytalker/article/details/50925218
    //在断点处右键 它提供了两种挂起的模式，默认的是All，只需要选中Thread，它就会一直等待到你处理它。
    //右边的Make Default功能会使得之后打上的断点也会是Thread模式的（注意，之前打上的不会变更，需要手工更改）。
    //在 Frames窗口下拉框中切换主线程与其他子线程
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Throwing in MyThread");
        throw new RuntimeException();
    }
}
