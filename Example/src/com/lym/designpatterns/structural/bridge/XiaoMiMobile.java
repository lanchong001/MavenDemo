package com.lym.designpatterns.structural.bridge;

/**
 * Created by lym on 2017/3/16.
 */
//小米手机
public class XiaoMiMobile extends HandsetBrand {

    @Override
    public void Run() {

        if(this.softs != null && !this.softs.isEmpty())
        {
            System.out.print("小米手机 ");
            for(HandsetSoft soft : this.softs)
            {
                soft.Run();
            }
        }

    }

}
