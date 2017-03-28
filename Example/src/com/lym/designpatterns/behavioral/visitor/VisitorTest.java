package com.lym.designpatterns.behavioral.visitor;

/**
 * Created by lym on 2017/3/28.
 */
public class VisitorTest {

    public static void main(String[] args)
    {
        ObjectStructure os = new ObjectStructure();
        os.attach(new Woman());
        os.attach(new Man());

        //成功时
        Success s = new Success();
        os.display(s);

        //失败时
        Fail f = new Fail();
        os.display(f);

        //恋爱时
        Love l = new Love();
        os.display(l);
    }

}
