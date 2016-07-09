package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 * 递归创建目录
 * 使用 File 类的 mkdirs() 实现递归创建目录
 * Created by lym on 2016/7/9.
 */
public class FileMkdirs {
    public static void main(String[] args){

        String directories = "G:\\日常积累\\JAVA\\MavenDemo\\DemoMenu\\test\\1\\2\\3";
        File file = new File(directories);
        boolean result = file.mkdirs();  //递归创建目录

        // String directories = "G:\\日常积累\\JAVA\\MavenDemo\\DemoMenu\\test";
        // boolean result = file.mkdir();   //不能创建多级目录
        System.out.println("Status = " + result);
    }
}
