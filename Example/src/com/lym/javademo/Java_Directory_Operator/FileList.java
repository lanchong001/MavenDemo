package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 * 查找当前目录下的所有文件和文件夹
 * 使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表
 * Created by lym on 2016/7/9.
 */
public class FileList {

    public static void main(String[] args) throws Exception {
        File dir = new File("G:\\study\\JAVA\\MavenDemo\\DemoMenu");
        String[] children = dir.list();

        //注意：dir.list() 当当前路径下没有任何文件或者文件夹时，返回的结果children不为空, children = {};
        if(children == null || children.length == 0){
            System.out.println("当前目录不存在文件或者子文件夹");
        }
        else
        {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
