package com.lym.designpatterns.structural.bridge;

import com.lym.javademo.Java_Exception_Handler.SystemErrPrintln;

/**
 * Created by lym on 2017/3/16.
 */
//华为手机
public class HuaWeiMobile extends  HandsetBrand {

    @Override
    public void Run() {

        if(this.softs != null && !this.softs.isEmpty())
        {
            System.out.print("华为手机 ");
            for(HandsetSoft soft : this.softs)
            {
                soft.Run();
            }
        }

    }

}
