package com.lym.javademo.Java_File_Operator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件写入
 * Created by lym on 2016/7/10.
 */
public class BufferedWriterWrite {

    //演示了使用 write() 方法向文件写入内容?

    public static void main(String[] args){
        try{

            //这里没有设定文件名和文件路径，所以，文件默认创建在当前项目根目录
            BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
            out.write("hell world,hello everyone");
            out.close();
            System.out.println("文件创建成功");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
