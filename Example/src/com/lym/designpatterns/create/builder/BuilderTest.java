package com.lym.designpatterns.create.builder;

/**
 * Created by lym on 2017/3/11.
 */
public class BuilderTest {

    public static void main(String[] args)
    {
        Director director = new Director();
        Builder b1 = new ConCreteBuilder1();
        Builder b2 = new ConCreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.Show();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.Show();
    }
}
