package com.lym.designpatterns.structural.proxy;

/**
 * Created by lym on 2017/3/16.
 */
public class ProxyTest {

    public static void main(String[] args)
    {
        Man man = new Man("吕秀才");
        Matchmaker match = new Matchmaker("燕小六");
        Girl girl = new Girl("郭芙蓉");
        match.agreePropose(man);
        match.propose(girl);
    }

}
