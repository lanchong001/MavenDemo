package com.lym.designpatterns.behavioral.memento;

import com.lym.designpatterns.structural.facade.Memory;

/**
 * Created by lym on 2017/3/23.
 */
//备忘录数据
public class Memento {

    //生命力
    private int vit;

    //攻击力
    private int atk;

    //防御力
    private int def;

    public Memento(int vit,int ask,int def)
    {
        this.vit = vit;
        this.atk = ask;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
