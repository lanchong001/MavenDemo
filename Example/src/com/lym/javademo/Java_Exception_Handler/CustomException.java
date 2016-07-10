package com.lym.javademo.Java_Exception_Handler;

/**
 * 自定义异常
 * Created by lym on 2016/7/10.
 */
public class CustomException {
    //通过继承 Exception 来实现自定义异常
    public static void main(String[] args){
        try
        {
            new Input().method();
        }
        catch (WrongInputException w)
        {
            System.out.println(w.getMessage());
        }
    }
}

//继承Exception,自定义异常类
class WrongInputException extends Exception {
    WrongInputException(String s)
    {
        super(s);  //继承父类的方法
    }
}

class Input
{
    void method() throws WrongInputException {
        throw new WrongInputException("Wrong Input");
    }
}
