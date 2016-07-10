package com.lym.javademo.Java_File_Operator;

import java.io.File;

/**
 * 删除文件
 * Created by lym on 2016/7/10.
 */
public class FileDelete {
    //使用 delete() 方法将文件删除

    public static void main(String[] args) {
        try {
            File file = new File("outfilename");
            if (file.delete()) {
                System.out.println(file.getName() + " 文件已被删除！");
            } else {
                System.out.println("文件删除失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
