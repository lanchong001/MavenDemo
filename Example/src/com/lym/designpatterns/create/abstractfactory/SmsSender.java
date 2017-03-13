package com.lym.designpatterns.create.abstractfactory;

/**
 * Created by lym on 2017/3/11.
 */
public class SmsSender implements ISender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
