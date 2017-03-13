package com.lym.designpatterns.create.builder;

import java.util.*;

/**
 * Created by lym on 2017/3/11.
 */
//产品类
public class Product {

    ArrayList<String> parts = new ArrayList<String>();

    //添加产品部件
    public void Add(String part)
    {
        parts.add(part);
    }

    //列举所有的产品部件
    public void Show()
    {
        System.out.println("\n 产品 创建 ----");
        for(String part : parts)
        {
            System.out.println(part);
        }
    }

}
