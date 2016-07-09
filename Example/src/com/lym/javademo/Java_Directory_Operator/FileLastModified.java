package com.lym.javademo.Java_Directory_Operator;

import java.io.File;
import java.util.Date;

/**
 * 获取目录最后修改时间
 * 使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间
 * Created by lym on 2016/7/9.
 */
public class FileLastModified {
    public static void main(String[] args){
        File file = new File("G:\\日常积累\\JAVA\\MavenDemo\\DemoMenu\\1.txt");
        System.out.println("最后修改时间为： " + new Date(file.lastModified()));

        //file.lastModified() 获取当前文件或者文件夹的最后修改时间，返回长整型的时间戳

        //new Data(long time)  //时间戳转日期类型
    }
}
