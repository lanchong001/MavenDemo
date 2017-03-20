package com.lym.designpatterns.behavioral.strategy;

/**
 * Created by lym on 2017/3/20.
 */
//折扣收费子类
public class CashRabate extends CashSuper {

    private double moneyRabate = 1d;   //折扣,默认不打折

    public CashRabate(String moneyRabate)
    {
        this.moneyRabate = Double.parseDouble(moneyRabate);
    }

    @Override
    public double accepptCash(double money) {
        return moneyRabate * money;
    }
}
