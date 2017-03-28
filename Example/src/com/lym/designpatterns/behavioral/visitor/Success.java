package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
public class Success extends State {
    @Override
    public void ManAction(Man man) {
        System.out.println("男人成功时,背后多半有一个伟大的女人.");
    }

    @Override
    public void WomanAction(Woman woman) {
        System.out.println("女人成功时,背后大班有一个不成功的男人.");
    }
}
