package com.lym.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by lym on 2017/3/22.
 */
public class ChainTest {

    public static void main(String[] args)
    {
        Manager manager = new GeneralManager("吴总",null);

        Manager manager1 = new ProjectInspector("李总监",manager);

        Manager manager2 = new ProjectManager("杨经理",manager1);

        Request request1 = new Request("小明","请假",5);
        manager2.review(request1);

        Request request2 = new Request("小李","加薪",2000);
        manager2.review(request2);

        Request request3 = new Request("小红","请假",2);
        manager2.review(request3);
    }

}
