package com.lym.designpatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lym on 2017/3/16.
 */
//手机品牌
public abstract class HandsetBrand {

    //必须设置为protected,允许在子类中访问
    protected List<HandsetSoft> softs;

    public HandsetBrand()
    {
        softs = new ArrayList<HandsetSoft>();
    }

    //设置手机软件
    public void setHandsetSoft(HandsetSoft soft)
    {
        this.softs.add(soft);
    }

    //运行软件
    public abstract void Run();

}
