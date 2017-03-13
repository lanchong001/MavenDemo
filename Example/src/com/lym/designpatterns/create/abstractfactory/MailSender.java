package com.lym.designpatterns.create.abstractfactory;

/**
 * Created by lym on 2017/3/11.
 */
public class MailSender implements  ISender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
