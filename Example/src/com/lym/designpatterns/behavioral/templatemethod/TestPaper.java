package com.lym.designpatterns.behavioral.templatemethod;

/**
 * Created by lym on 2017/3/20.
 */
//试卷模板
public abstract class TestPaper {

    private String name;
    public TestPaper(String name)
    {
        this.name = name;
    }

    public void Question1()
    {
        System.out.print(String.format("%s同学的选择题1的",this.name));
        System.out.println(String.format("答案:%s",answer1()));
    }

    public abstract String answer1();
}
