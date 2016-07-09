package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 * 查看系统根目录
 * 使用 File 类的 listRoots() 方法来输出系统所有根目录
 * Created by lym on 2016/7/9.
 */
public class FileListRoots {
    public static void main(String[] args)
    {
        File[] roots = File.listRoots();
        System.out.println("系统所在根目录： ");
        for(int i=0; i< roots.length; i++){
            System.out.println(roots[i].toString());
        }
    }
}
