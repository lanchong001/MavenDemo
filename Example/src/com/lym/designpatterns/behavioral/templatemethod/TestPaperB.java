package com.lym.designpatterns.behavioral.templatemethod;

/**
 * Created by lym on 2017/3/20.
 */
//B同学的试卷
public class TestPaperB extends TestPaper {
    public TestPaperB(String name) {
        super(name);
    }

    @Override
    public String answer1() {
        return "B";
    }
}
