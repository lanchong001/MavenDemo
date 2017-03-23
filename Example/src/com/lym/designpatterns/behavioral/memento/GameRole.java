package com.lym.designpatterns.behavioral.memento;

/**
 * Created by lym on 2017/3/23.
 */
//游戏角色
public class GameRole {

    //生命力
    private int vit;

    //攻击力
    private int atk;

    //防御力
    private int def;

    public GameRole(int vit,int atk,int def)
    {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    //战斗
    public void fight()
    {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public void stateDisplay()
    {
        System.out.println("角色当前状态: ");
        System.out.println(String.format("生命力: %S",this.vit));
        System.out.println(String.format("攻击力: %S",this.atk));
        System.out.println(String.format("防御力: %S",this.def));
    }

    //保存备忘录
    public Memento saveState()
    {
        return new Memento(this.vit,this.atk,this.def);
    }

    public void restoreState(Memento memento)
    {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

}
