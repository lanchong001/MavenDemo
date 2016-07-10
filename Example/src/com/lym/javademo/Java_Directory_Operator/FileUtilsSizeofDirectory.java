package com.lym.javademo.Java_Directory_Operator;

import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 * 获取目录大小
 * 使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小
 * Created by lym on 2016/7/9.
 */
public class FileUtilsSizeofDirectory {
    public static void main(String[] args){

        //ileUtils.sizeOfDirectory(file)  //获取file文件夹或者文件的大小
        long size = FileUtils.sizeOfDirectory(new File("G:\\study\\JAVA\\MavenDemo\\DemoMenu"));
        System.out.println("Size: " + size + " bytes");
    }
}
