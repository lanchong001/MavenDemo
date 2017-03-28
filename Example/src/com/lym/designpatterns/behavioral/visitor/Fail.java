package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
public class Fail extends State {
    @Override
    public void ManAction(Man man) {
        System.out.println("男人失败时,闷头喝酒,谁也不用劝.");
    }

    @Override
    public void WomanAction(Woman woman) {
        System.out.println("女人失败时,眼泪汪汪,谁也劝不动.");
    }
}
