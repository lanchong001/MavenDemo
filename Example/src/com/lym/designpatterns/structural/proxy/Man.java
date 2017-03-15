package com.lym.designpatterns.structural.proxy;

/**
 * Created by lym on 2017/3/16.
 */
//男人
public class Man extends Person implements IMarry {


    public Man(String name) {
        super(name);
    }

    @Override
    public void propose(Girl girl) {
        System.out.println(String.format("%s,你愿意嫁给%s吗?",girl.getName(),this.getName()));
    }

}
