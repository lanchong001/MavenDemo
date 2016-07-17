package com.lym.javademo.Java_Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 查看端口是否已使用
 * 使用 Socket 连接到指定主机
 * Created by lym on 2016/7/17.
 */
public class SocketEmp {
    //如何检测端口是否已经使用
    public static void main(String[] args){

        String host = "localhost";
        if(args.length > 0)
        {
            host = args[0];
        }
        for(int i = 0; i < 10; i++)
        {
            try
            {
                System.out.println("查看 "+ i);
                //如果能够连通，则不会报错，并且表示当前host和端口号已经使用
                //如果不能连通, 则报IO错误
                Socket socket = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            }
            catch (UnknownHostException e) {
                System.out.println("Exception occured"+ e);
                break;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        //如何使用 net.Socket 类的 getInetAddress() 方法来连接到指定主机
        try {
            // 连接 www.w3cschool.cc 的 80 端口
            Socket sock = new Socket("www.w3cschool.cc", 80);
            // 获取对应的主机IP
            InetAddress addr = sock.getInetAddress();
            System.out.println("连接到 " + addr);
            sock.close();

            // 连接 localhost 的 8080 端口  tomcat启动本地web程序 Http协议连接http://localhost:8080/
            Socket sock1 = new Socket("localhost", 8080);
            // 获取对应的主机IP
            InetAddress addr1 = sock1.getInetAddress();
            System.out.println("连接到 " + addr1);
            sock1.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}
