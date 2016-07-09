package com.lym.javademo.Java_Directory_Operator;

import java.io.File;
import java.io.IOException;

/**
 * 打印目录结构，遍历指定目录的所有目录
 * 使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构
 * Created by lym on 2016/7/9.
 */
public class FileListFiles {
    public static void main(String[] args) throws IOException {
        showDir(3,new File("G:\\日常积累\\JAVA\\MavenDemo\\DemoMenu"));
    }

    //递归遍历目录
    public static void showDir(int indent,File file) throws IOException{
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());  //获取文件名
        if (file.isDirectory()) {  //判断是否是文件夹
            File[] files = file.listFiles();  //获取当前文件夹下的所有文件和文件夹集合
            for (int i = 0; i < files.length; i++)
                showDir(indent + 4, files[i]);
        }
    }
}
