package com.lym.designpatterns.create.builder;

/**
 * Created by lym on 2017/3/11.
 */
public class ConCreteBuilder2 extends Builder {

    Product product = new Product();

    @Override
    public void builderPartA() {
        product.Add("Builder2 PartA");
    }

    @Override
    public void builderPartB() {
        product.Add("Builder2 PartB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
