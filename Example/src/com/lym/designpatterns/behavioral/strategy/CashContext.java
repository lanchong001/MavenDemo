package com.lym.designpatterns.behavioral.strategy;

/**
 * Created by lym on 2017/3/20.
 */
//收费上下文  策略类
public class CashContext {

    CashSuper cs = null;

    public CashContext(String type)
    {
        if(type == "正常收费")
            cs = new CashNormal();
        else if(type == "满300返100")
            cs = new CashResurn("300","100");
        else if(type == "打8折")
            cs = new CashRabate("0.8");
    }

    public double getResult(double money)
    {
        return cs.accepptCash(money);
    }
}
