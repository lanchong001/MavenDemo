package com.lym.javademo.Java_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取指定主机的IP地址
 * Created by lym on 2016/7/11.
 */
public class InetAddressGetByName {
    //如何使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址
    public static void main(String[] args)
    {
        InetAddress address = null;
        try
        {
            address = InetAddress.getByName("www.baidu.com");
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
            System.exit(2);
        }

        //address.getHostName() ：获取主机名称
        //address.getHostAddress() : 获取主机地址
        System.out.println(address.getHostName() + " = " + address.getHostAddress());
        System.exit(0);
    }
}
