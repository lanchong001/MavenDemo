package com.lym.designpatterns.create.abstractfactory;

/**
 * Created by lym on 2017/3/11.
 */
public class FactoryTest {
    public static void main(String[] args)
    {
        //需要更换对象时，只需要修改这一句
        //IFactory factory = new MailSenderFactory();
        IFactory factory = new SmsSenderFactory();
        ISender sender = factory.Create();
        sender.Send();

        /*
            抽象工厂与工厂方法的区别

            抽象工厂针对每一个实体类都会创建一个对应的工厂类，并且这些工厂类都实现工厂接口。如果需要新增实体类的话，需要新增实体类和实体类对应的工厂类
            工厂方法类将每一个实体类的创建都集中在单个工厂类的工厂方法中，因此，如果需要新增新增实体类的话，需要新增实体类，并且修改工程方法。
         */
    }
}
