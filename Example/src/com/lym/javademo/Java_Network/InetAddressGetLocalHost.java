package com.lym.javademo.Java_Network;

import java.net.InetAddress;

/**
 * 获取本机ip地址及主机名
 * Created by lym on 2016/7/17.
 */
public class InetAddressGetLocalHost {
    //如何使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名
    public static void main(String[] args) throws Exception {
        //获取本机的主机信息
        InetAddress address = InetAddress.getLocalHost();
        //address.getHostAddress() 主机地址
        System.out.println("Local HostAddress: "+address.getHostAddress());
        //address.getHostName() 主机名
        System.out.println("Local host name: " + address.getHostName());
    }
}
