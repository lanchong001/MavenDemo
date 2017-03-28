package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
//女人
public class Woman extends Person {

    @Override
    public void stateReaction(State state)
    {
        state.WomanAction(this);
    }

}
