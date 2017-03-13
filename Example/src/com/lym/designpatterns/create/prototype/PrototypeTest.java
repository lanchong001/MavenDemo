package com.lym.designpatterns.create.prototype;

/**
 * Created by lym on 2017/3/13.
 */
public class PrototypeTest {

    public static void main(String[] args) throws Exception
    {
        Prototype proto = new Prototype();
        proto.setId("111");
        System.out.println(proto.getId());

        Prototype proto1 = (Prototype) proto.clone();
        System.out.println(proto.getId());
    }
}
