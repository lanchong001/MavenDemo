package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 获取文件大小
 * Created by lym on 2016/7/10.
 */
public class FileLength {
    //使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）：

    public static void main(String[] args){
        File file = new File("javaFile.txt");

        //file.exists() 判断文件是否存在
        //file.isFile() 判断是否是文件，还有可能是文件夹
        if(!file.exists() || !file.isFile()){
            System.out.println("文件不存在");
        }
        else
        {
            //file.length() 获取文件的大小 单位为字节
            System.out.println("javaFile.txt文件大小为: " + file.length());
        }
    }
}
