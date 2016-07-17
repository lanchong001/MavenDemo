package com.lym.javademo.Java_Network;


/*
1、建立服务器端
    服务器建立通信ServerSocket
    服务器建立Socket接收客户端连接
    建立IO输入流读取客户端发送的数据
    建立IO输出流向客户端发送数据消息
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket 和 Socket 通信实例
 * 服务器端代码
 * Created by lym on 2016/7/17.
 */
public class ServiceSocketDemo {
    //如何实现客户端发送消息到服务器，服务器接收到消息并读取输出，然后写出到客户端客户端接收到输出。
    public static void main(String[] args) {
        try {
            //服务器建立通信ServerSocket
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("启动服务器....");
            //服务器建立Socket接收客户端连接 接受客户端socket连接
            Socket s = ss.accept();
            System.out.println("客户端:"+s.getInetAddress().getLocalHost()+"已连接到服务器");

            //建立IO输入流读取客户端发送的数据
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //读取客户端发送来的消息
            String mess = br.readLine();
            System.out.println("客户端："+mess);

            //建立IO输出流向客户端发送数据消息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(mess+"\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
