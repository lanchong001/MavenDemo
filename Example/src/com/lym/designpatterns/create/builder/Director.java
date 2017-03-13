package com.lym.designpatterns.create.builder;

import javafx.util.*;

/**
 * Created by lym on 2017/3/11.
 */
//指挥类，指挥产品的创建过程
public class Director {

    //按顺序组装产品的部件
    public void Construct(Builder builder)
    {
        builder.builderPartA();
        builder.builderPartB();
    }

}
