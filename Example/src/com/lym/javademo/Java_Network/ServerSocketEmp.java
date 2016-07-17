package com.lym.javademo.Java_Network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket 实现多线程服务器程序
 * Created by lym on 2016/7/17.
 */
public class ServerSocketEmp implements Runnable {
    //如何使用 Socket 类的 accept() 方法和 ServerSocket 类的 MultiThreadServer(socketname) 方法来实现多线程服务器程序
    Socket csocket;
    ServerSocketEmp(Socket csocket)
    {
        this.csocket = csocket;
    }

    @Override
    public void run() {
        try {
            PrintStream pstream = new PrintStream(csocket.getOutputStream());
            for (int i = 100; i >= 0; i--) {
                pstream.println(i + " bottles of beer on the wall");
            }
            pstream.close();
            csocket.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) throws Exception {
        ServerSocket ssock = new ServerSocket(1234);
        System.out.println("Listening");
        while (true) {
            Socket sock = ssock.accept();
            System.out.println("Connected");
            new Thread(new ServerSocketEmp(sock)).start();
        }
    }
}
