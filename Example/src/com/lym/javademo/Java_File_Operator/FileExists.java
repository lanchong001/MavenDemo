package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 检测文件是否存在
 * Created by lym on 2016/7/10.
 */
public class FileExists {
    //使用 File 类的 file.exists() 方法来检测文件是否存在：
    public static void main(String[] args) {
        File file = new File("NodeJsFile.txt");
        System.out.println(file.exists());
        //file.exists() 判断文件是否存在
    }
}
