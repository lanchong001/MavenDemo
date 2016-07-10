package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 设置文件只读
 * Created by lym on 2016/7/10.
 */
public class FileSetReadOnly {
    //使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读
    public static void main(String[] args) {
        File file = new File("NoteJsFile.txt");
        System.out.println(file.setReadOnly());
        //file.setReadOnly() 设置文件自读
        System.out.println(file.canWrite());
        //file.canWrite() 判断文件是否可写
    }
}
