package com.lym.javademo.Java_Thread;

/**
 * 获取线程id
 * Created by lym on 2016/7/19.
 */
public class GetThreadIDTest extends Object implements Runnable {
    //如何获取线程id?

    private  ThreadID var;

    public GetThreadIDTest(ThreadID v)
    {
        this.var = v;
    }

    public void run(){
        try{
            print("var getThreadID = " + var.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID = " + var.getThreadID());
        }
        catch (InterruptedException x)
        {

        }
    }

    private static void print(String msg)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " : " + msg);
    }

    public static void main(String[] args){
        ThreadID tid = new ThreadID();
        GetThreadIDTest shared = new GetThreadIDTest(tid);
        try{
            Thread threadA = new Thread(shared, "threadA");
            threadA.start();

            Thread.sleep(500);

            Thread threadB = new Thread(shared, "threadB");
            threadB.start();

            Thread.sleep(500);

            Thread threadC = new Thread(shared, "threadC");
            threadC.start();
        }
        catch (InterruptedException e)
        {

        }
    }
}

class ThreadID extends  ThreadLocal{
    private int nextID;

    public ThreadID(){
        nextID = 10001;
    }

    private synchronized Integer getNewID(){
        Integer id = new Integer(nextID);
        nextID ++;
        return id;
    }

    //重写initialValue方法，实际上已经给get方法赋值了。
    protected Object initialValue() {  //initialValue() 初始化
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID() {
        Integer id = (Integer) get();  //get() 用来获取ThreadLocal在当前线程中保存的变量副本
        return id.intValue();
    }

    //  set()用来设置当前线程中变量的副本
    //  remove()用来移除当前线程中变量的副本

    /* get 方法实现
        public T get() {
            Thread t = Thread.currentThread();
            ThreadLocalMap map = getMap(t);
            if (map != null) {
                ThreadLocalMap.Entry e = map.getEntry(this);
                if (e != null)
                    return (T)e.value;
                }
            return setInitialValue();
        }
        //setInitialValue 方法实现
        private T setInitialValue() {
            T value = initialValue();
            Thread t = Thread.currentThread();
            ThreadLocalMap map = getMap(t);
            if (map != null)
                map.set(this, value);
            else
                createMap(t, value);
            return value;
        }
    */

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    /*
    　　ThreadLocal总结一下：
    　　  1）实际的通过ThreadLocal创建的副本是存储在每个线程自己的threadLocals中的；
    　　  2）为何threadLocals的类型ThreadLocalMap的键值为ThreadLocal对象，因为每个线程中可有多个threadLocal变量，就像上面代码中的longLocal和stringLocal；
    　　  3）在进行get之前，必须先set，否则会报空指针异常；
    　　    如果想在get之前不需要调用set就能正常访问的话，必须重写initialValue()方法。
    */
}
