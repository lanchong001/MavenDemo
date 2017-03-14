package com.lym.designpatterns.structural.decorator;

/**
 * Created by lym on 2017/3/14.
 */
public class DecoratorTest {

    public static void main(String[] args)
    {
        Person person = new Person("小马");

        Finery finery = new BigTrouser();
        finery.Decorate(person);   //给某个人进行装扮,穿一件垮裤
        finery.show();

        Finery finery1 = new TShirt();
        finery1.Decorate(finery);  //给穿垮裤的人进行装扮,再穿一件T恤
        finery1.show();
    }

}
