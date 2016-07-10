package com.lym.javademo.Java_File_Operator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * 创建临时文件
 * 在指定目录中创建临时文件
 * Created by lym on 2016/7/10.
 */
public class FileCreateTempFile {
    //演示了使用 File 类的 createTempFile() 方法来创建临时文件
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("tempFile",".test");
        temp.deleteOnExit();  //不添加这一句，创建的临时文件，在程序结束时，不会自动删除
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建:");
        out.close();

        //注意：临时文件创建的路径在系统临时目录，不是默认的项目根目录
        //C:\Users\lym\AppData\Local\Temp\tempFile7767624809494841873.test

        //使用 File 类的 file.createTempFile() 方法在指定目录中创建临时文件
        File dir = new File("G:\\study\\JAVA\\MavenDemo\\DemoMenu");
        File file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
        //G:\study\JAVA\MavenDemo\DemoMenu\JavaTemp6316511071236528401.javatemp
    }
}
