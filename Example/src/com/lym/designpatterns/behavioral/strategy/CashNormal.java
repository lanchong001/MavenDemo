package com.lym.designpatterns.behavioral.strategy;

/**
 * Created by lym on 2017/3/20.
 */
//正常收费子类
public class CashNormal extends CashSuper {

    @Override
    public double accepptCash(double money) {
        return money;
    }
}
