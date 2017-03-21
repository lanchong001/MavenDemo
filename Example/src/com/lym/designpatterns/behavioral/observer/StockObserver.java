package com.lym.designpatterns.behavioral.observer;

/**
 * Created by lym on 2017/3/21.
 */
//看股票的同事
public class StockObserver extends Observer{
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void Update() {
        System.out.println(String.format("%s %s 关闭股票,继续工作!",this.name,this.subject.getSubjectState()));
    }
}
