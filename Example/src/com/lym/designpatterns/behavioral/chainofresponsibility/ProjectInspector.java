package com.lym.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by lym on 2017/3/22.
 */
//项目总监
public class ProjectInspector extends Manager {

    public ProjectInspector(String name, Manager leadership) {
        super(name, leadership);
    }

    @Override
    public void review(Request request) {
        if(request.getName() == "请假" && request.getNumber() > 2  && request.getNumber() <= 5)
        {
            System.out.println(String.format("%s 天, %s 审核同意了.",request.getRequest(),this.name));
        }
        else if(request.getName() == "加薪" && request.getNumber() <= 500)
        {
            System.out.println(String.format("%s 元, %s 审核同意了.",request.getRequest(),this.name));
        }
        else
        {
            if(this.leadership != null)
                this.leadership.review(request);
        }
    }
}
