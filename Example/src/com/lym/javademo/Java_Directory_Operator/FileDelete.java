package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 * 删除目录
 * 使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录
 * Created by lym on 2016/7/9.
 */
public class FileDelete {

    public static void main(String[] args){
        // 删除当前目录下的 test 目录
        deleteDir(new File("G:\\日常积累\\JAVA\\MavenDemo\\DemoMenu\\test"));
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                //递归删除目录
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        //如果文件夹下也存在文件的话，也会被删除
        if(dir.delete()) {   //删除文件或者文件夹
            System.out.println("目录已被删除！");
            return true;
        } else {
            System.out.println("目录删除失败！");
            return false;
        }
    }
}
