package com.lym.designpatterns.structural.composite;

/**
 * Created by lym on 2017/3/17.
 */
public class OrganizationTest {

    public static void main(String[] args) throws Exception {
        Organization organization = new Organization("中国");

        Organization hunan = new Organization("湖南省");
        Organization yueyang = new Organization("岳阳市");
        Organization linxiang = new Organization("临湘市");

        Organization guangdong = new Organization("广东省");
        Organization guangzhou = new Organization("广州市");
        Organization tianhe = new Organization("天河区");

        organization.Add(hunan);
        organization.Add(guangdong);

        hunan.Add(yueyang);
        yueyang.Add(linxiang);

        guangdong.Add(guangzhou);
        guangzhou.Add(tianhe);

        organization.toShow(1);

        System.out.println("----------------------------------------");
        Org county = new Country("中国");
        //county.setParent(new Province("测试"));
        county.toShow(1);

        Org  hubei = new Province("湖北省");
        county.AddChildren(hubei);

        Org chibi = new City("赤壁市");
        hubei.AddChildren(chibi);

        Org wuhan = new City("武汉市");
        hubei.AddChildren(wuhan);

        Org tongcheng = new Area("通城县");
        chibi.AddChildren(tongcheng);

        county.toShow(1);

    }

}
