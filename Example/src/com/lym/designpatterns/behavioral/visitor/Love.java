package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
public class Love extends State {
    @Override
    public void ManAction(Man man) {
        System.out.println("男人恋爱时,凡是不懂也要装懂.");
    }

    @Override
    public void WomanAction(Woman woman) {
        System.out.println("女人恋爱时,遇事懂也装作不懂.");
    }
}
