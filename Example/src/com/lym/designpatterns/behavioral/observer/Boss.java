package com.lym.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/21.
 */
//老板
public class Boss implements  Subject {

    private String subjectState;
    List<Observer> list = new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void del(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.Update();
        }
    }

    @Override
    public String getSubjectState() {
        return subjectState;
    }

    @Override
    public void setSubjectStatue(String subjectState) {
        this.subjectState = subjectState;
    }
}
