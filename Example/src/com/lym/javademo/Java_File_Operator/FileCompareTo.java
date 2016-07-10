package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 文件路径比较
 * Created by lym on 2016/7/10.
 */
public class FileCompareTo {
    //使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下

    public static void main(String[] args){
        //  File file1 = new File("G:\\study\\JAVA\\MavenDemo\\srcFile");
        //  File file2 = new File("G:\\study\\JAVA\\MavenDemo\\targetFile");
        //  文件路径不一致！

        File file1 = new File("G:\\study\\JAVA\\MavenDemo\\srcFile");
        File file2 = new File("G:\\study\\JAVA\\MavenDemo\\srcFile");
        //文件路径一致！

        if(file1.compareTo(file2) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }
    }
}
