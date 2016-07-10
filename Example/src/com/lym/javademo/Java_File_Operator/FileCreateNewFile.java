package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 在指定目录中创建文件
 * 创建文件
 * Created by lym on 2016/7/10.
 */
public class FileCreateNewFile {
    public static void main(String[] args) throws Exception {
        File file = new File("G:\\study\\JAVA\\MavenDemo\\JavaTemp.javatemp");
        if(file.createNewFile())
            System.out.println("文件创建成功！");
        else
            System.out.println("出错了，改文件已经存在。");
        System.out.println(file.getPath());
    }
}
