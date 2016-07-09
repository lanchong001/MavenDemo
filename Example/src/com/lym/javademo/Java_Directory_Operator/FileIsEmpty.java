package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 * 判断目录是否为空
 * 使用 File 类的 file.isDirectory(),file.list() 和 file.getPath() 方法来判断目录是否为空
 * Created by lym on 2016/7/9.
 */
public class FileIsEmpty {
    public static void main(String[] args)
    {
        File file = new File("G:\\日常积累\\JAVA\\MavenDemo\\DemoMenu");
        if(file.isDirectory())  //判断是否是文件夹
        {
            String[] files = file.list();   //获取当前文件夹下的所有文件路径
            if(files.length > 0)   //判断文件路径数是否大于0
            {
                System.out.println("目录 " + file.getPath() + " 不为空！");
            }
            else
            {
                System.out.println("目录 " + file.getPath() + " 为空！");
            }
            //file.getPath() 获取当前文件的文件路径
        }
    }
}
