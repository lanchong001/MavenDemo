package com.lym.designpatterns.create.builder;

/**
 * Created by lym on 2017/3/11.
 */

//产品创建类,创建产品的各个部件及产品
public abstract class Builder {

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract Product getResult();
}

//统一产品的创建步骤(隐藏产品的组装)

//建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时使用的模式
