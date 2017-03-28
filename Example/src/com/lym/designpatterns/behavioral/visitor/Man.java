package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
//男人
public class Man extends Person {

    @Override
    public void stateReaction(State state)
    {
        state.ManAction(this);
    }

}
