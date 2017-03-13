package com.lym.designpatterns.create.builder;

import javafx.util.*;

/**
 * Created by lym on 2017/3/11.
 */
public class ConCreteBuilder1 extends Builder {

    private  Product product = new Product();

    @Override
    public void builderPartA() {
        product.Add("Builder1 PartA");
    }

    @Override
    public void builderPartB() {
        product.Add("Builder1 PartB");
    }

    @Override
    public Product getResult() {
        return product;
    }

}
