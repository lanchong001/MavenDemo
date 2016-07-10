package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 * 获取文件的上级目录
 * 使用 File 类的 file.getParent() 方法来获取文件的上级目录
 * Created by lym on 2016/7/9.
 */
public class FileGetParent {
    public static void main(String[] args){
        File file = new File("G:\\study\\JAVA\\MavenDemo\\DemoMenu");
        String parentDir = file.getParent();
        //file.getParent() 返回上一级目录路径
        System.out.println("文件的上级目录为 : " + parentDir);
    }
}
