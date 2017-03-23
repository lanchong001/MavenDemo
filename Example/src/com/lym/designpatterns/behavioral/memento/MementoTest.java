package com.lym.designpatterns.behavioral.memento;

/**
 * Created by lym on 2017/3/23.
 */
public class MementoTest {

    public static void main(String[] args)
    {
        System.out.println("游戏开始——————————————————");
        GameRole role = new GameRole(100,100,100);
        role.stateDisplay();
//        Memento memento = role.saveState();
//        System.out.println("战斗中——————————————————");
//        role.fight();
//        role.stateDisplay();
//        System.out.println("恢复原来的游戏进度——————————————————");
//        role.restoreState(memento);
//        memento对象直接暴露给了用户

        //游戏管理者(游戏本身)
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.saveState());  //游戏存盘
        System.out.println("战斗中——————————————————");
        role.fight();
        role.stateDisplay();
        System.out.println("恢复原来的游戏进度——————————————————");
        role.restoreState(caretaker.getMemento());
//      使用Caretaker对象存储和还原memento对象的话,符合实际的应用场景.
//      真实的游戏中,存盘时,文件不是直接存储在用户这里，用户也不能直接使用备忘录文件
//      真实的游戏中,用户选择存盘时,游戏自动存入游戏内部的某个目录,对于玩家来说,不需要知道是什么文件,也不需要知道文件文件存放在电脑的哪个目录

        role.stateDisplay();

    }

}
