package com.lym.javademo.Java_File_Operator;

import java.io.File;
import java.util.Date;

/**
 * 修改文件最后的修改日期
 * 获取文件修改时间
 * Created by lym on 2016/7/10.
 */
public class FileSetLastModified {
    public static void main(String[] args) throws Exception {
        File file = new File("javaFile.txt");
        boolean result = file.createNewFile();
        if(result) {
            Date fileTime = new Date(file.lastModified());

            //file.lastModified() 获取文件的最后修改时间  时间戳
            System.out.println(fileTime.toString());

            Thread.sleep(2000);
            System.out.println(file.setLastModified(System.currentTimeMillis()));

            //file.lastModified() 获取文件修改时间 long型 时间戳
            //file.setLastModified(System.currentTimeMillis()) 将文件的最后修改时间设置为当前系统时间
            //file.setLastModified(System.currentTimeMillis()) 返回 ture 或者　false，表示设置最后修改时间是否成功
            fileTime = new Date(file.lastModified());
            System.out.println(fileTime.toString());
        }
    }
}
