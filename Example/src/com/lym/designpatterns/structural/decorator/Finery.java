package com.lym.designpatterns.structural.decorator;

/**
 * Created by lym on 2017/3/14.
 */
//服饰类,装饰类
public class Finery extends Person {

    protected Person person;

    //打扮
    public void Decorate(Person person)
    {
        this.person = person;
    }

    @Override
    public void show()
    {
        if(person != null)
            person.show();
    }
}
