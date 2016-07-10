package com.lym.javademo.Java_Exception_Handler;

/**
 * 重载方法异常处理
 * Created by lym on 2016/7/10.
 */
public class OverloadingException {

    double method(int i) throws Exception{
        return i/0;
    }

    boolean method(boolean b)
    {
        return !b;
    }

    static double method(int x,double y) throws Exception {
        return x + y;
    }

    static double method(double x,double y){
        return x + y - 3;
    }

    public static void main(String[] args){
        OverloadingException over = new OverloadingException();
        try{
            System.out.println(over.method(false));
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(over.method(10));
        }
        catch (Exception e){
            System.out.println("exception occoure: "+ e);
        }
    }
}
