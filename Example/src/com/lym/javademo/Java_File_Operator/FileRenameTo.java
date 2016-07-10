package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 文件重命名
 * Created by lym on 2016/7/10.
 */
public class FileRenameTo {
    //使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
    public static void main(String[] args){
        File oldName = new File("javaFile.txt");
        //当javaFile.txt文件不存在时，renameTo修改文件名会返回false,不会报错
        File newName = new File("NodeJsFile.txt");

        //oldName.createNewFile() 只有调用这个方法才会创建文件 new File("filename")不会创建文件
        if(oldName.renameTo(newName))
        {
            System.out.println("已重命名");
        }
        else {
            System.out.println("Error");
        }
    }
}
