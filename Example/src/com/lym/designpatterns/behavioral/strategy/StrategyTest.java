package com.lym.designpatterns.behavioral.strategy;

/**
 * Created by lym on 2017/3/20.
 */
public class StrategyTest {

    public static void main(String[] args)
    {
        //客户不需要关心具体的折扣算法,只需要告诉计算器(CashContext),选择了哪种打折的方式
        CashContext cc = new CashContext("打8折");
        //根据实际消费的金额数和折扣算法,计算出打折后的结果
        double result = cc.getResult(500d);
        System.out.println(String.format("总价500元,打8折后,总计:%s",result));
    }
}
