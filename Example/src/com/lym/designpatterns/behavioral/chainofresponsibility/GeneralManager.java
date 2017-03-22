package com.lym.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by lym on 2017/3/22.
 */
//总经理
public class GeneralManager extends Manager {

    public GeneralManager(String name, Manager leadership) {
        super(name, leadership);
    }

    @Override
    public void review(Request request) {

        if(request.getName() == "请假" && request.getNumber() > 5  && request.getNumber() <= 10)
        {
            System.out.println(String.format("%s 天, %s 审核同意了.",request.getRequest(),this.name));
        }
        else if(request.getName() == "请假" && request.getNumber() > 10)
        {
            System.out.println(String.format("%s 天, %s 审核不同意,时间太长了.",request.getRequest(),this.name));
        }
        else if(request.getName() == "加薪" && request.getNumber() > 500 && request.getNumber() <= 1000)
        {
            System.out.println(String.format("%s 元, %s 审核同意了.",request.getRequest(),this.name));
        }
        else if(request.getName() == "加薪" && request.getNumber() > 1000)
        {
            System.out.println(String.format("%s 元, %s 审核不同意,以后再说.",request.getRequest(),this.name));
        }
        else
        {
            if(this.leadership != null)
                this.leadership.review(request);
        }
    }
}
