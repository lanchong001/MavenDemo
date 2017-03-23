package com.lym.designpatterns.behavioral.memento;

/**
 * Created by lym on 2017/3/23.
 */
//管理者(游戏本身)
public class Caretaker {

    //备份文件
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
