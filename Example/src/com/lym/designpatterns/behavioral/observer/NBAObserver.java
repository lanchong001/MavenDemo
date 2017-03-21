package com.lym.designpatterns.behavioral.observer;

/**
 * Created by lym on 2017/3/21.
 */
//看NBA的同事
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void Update() {
        System.out.println(String.format("%s %s 关闭NAB直播,继续工作!",this.name,this.subject.getSubjectState()));
    }
}
