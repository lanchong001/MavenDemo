package com.lym.designpatterns.behavioral.templatemethod;

/**
 * Created by lym on 2017/3/20.
 */
public class TemplatemethodTest {

    public static void main(String[] args)
    {
        //以TestPaper为模板,创建试卷A（TestPaperA）
        TestPaper A = new TestPaperA("张三");
        A.Question1();

        //以TestPaper为模板,创建试卷B（TestPaperB）
        TestPaper B = new TestPaperB("李四");
        B.Question1();
    }

}
