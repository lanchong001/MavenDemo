package com.lym.designpatterns.behavioral.templatemethod;

/**
 * Created by lym on 2017/3/20.
 */
//A同学的试卷
public class TestPaperA extends TestPaper {
    public TestPaperA(String name) {
        super(name);
    }

    @Override
    public String answer1() {
        return "C";
    }
}
