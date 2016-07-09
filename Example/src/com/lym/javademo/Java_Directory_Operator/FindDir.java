package com.lym.javademo.Java_Directory_Operator;

import java.io.File;
import java.io.FileFilter;

/**
 * 遍历指定目录下的所有目录
 * 如何使用 File 类的 list 方法来遍历指定目录下的所有目录(不包括目录下的文件)
 * Created by lym on 2016/7/9.
 */
public class FindDir {
    public static void main(String[] args) {
        File dir = new File("H:");
        File[] files = dir.listFiles();

        //此处是匿名类，
        // 直接通过new FileFilter,然后实现接口方法，而初始化一个FileFilter类型的对象
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();  //判断当前文件是否是一个目录
            }
        };
        files = dir.listFiles(fileFilter);   //过滤所有是目录的文件
        System.out.println(files.length);
        if (files.length == 0) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }
}
