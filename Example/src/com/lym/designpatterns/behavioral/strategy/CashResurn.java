package com.lym.designpatterns.behavioral.strategy;

/**
 * Created by lym on 2017/3/20.
 */
//返利收费子类
public class CashResurn extends CashSuper {

    //默认没有返现
    private double moneyCondition = 0.0d; //返利条件
    private double moneyReturn = 0.0d;  //返利值
    public CashResurn(String moneyCondition,String moneyReturn)
    {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double accepptCash(double money) {
        double result = money;
        if(money > moneyCondition)
            money = money - Math.floor(money/moneyCondition) * moneyReturn;
        return money;
    }
}
