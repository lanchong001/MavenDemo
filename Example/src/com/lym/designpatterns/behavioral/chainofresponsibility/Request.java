package com.lym.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by lym on 2017/3/22.
 */
//请求
public class Request {

    //请求人
    private String requestPerson;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    //请求类型
    private String name;

    //数量
    private int number;

    public Request(String requestPerson,String name,int number)
    {
        this.requestPerson = requestPerson;
        this.name = name;
        this.number = number;
    }

    public String getRequest()
    {
        return String.format("%s 请求 %s %s",this.requestPerson,this.name,this.number);
    }
}
