package com.lym.designpatterns.structural.bridge;

/**
 * Created by lym on 2017/3/16.
 */
public class BridgeTest {

    public static void main(String[] args)
    {
        HandsetBrand brand1 = new HuaWeiMobile();
        brand1.setHandsetSoft(new HandsetGame());
        brand1.Run();

        HandsetBrand brand2 = new XiaoMiMobile();
        brand2.setHandsetSoft(new HandsetMp3());
        brand2.Run();

    }

}
