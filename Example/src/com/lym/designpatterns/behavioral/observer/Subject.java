package com.lym.designpatterns.behavioral.observer;

/**
 * Created by lym on 2017/3/21.
 */
//主题(通知者接口)
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObserver();

    public String getSubjectState();

    public void  setSubjectStatue(String subjectState);

}
