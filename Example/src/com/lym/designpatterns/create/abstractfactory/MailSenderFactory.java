package com.lym.designpatterns.create.abstractfactory;

/**
 * Created by lym on 2017/3/11.
 */
public class MailSenderFactory implements IFactory {
    @Override
    public ISender Create() {
        return new MailSender();
    }
}
