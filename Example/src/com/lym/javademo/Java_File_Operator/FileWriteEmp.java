package com.lym.javademo.Java_File_Operator;

import java.io.*;

/**
 * 向文件中追加数据
 * Created by lym on 2016/7/10.
 */
public class FileWriteEmp {
    //演示了使用 filewriter 方法向文件中追加数据
    public static void main(String[] args) throws Exception{
        try {
            //public FileWriter(String fileName)
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");  //写入文件内容
            out.close();
            // public FileWriter(String fileName, boolean append)

            //out = new BufferedWriter(new FileWriter("filename"));
            //out = new BufferedWriter(new FileWriter("filename",false));
            //如果不带append参数，则不会追加，直接覆盖到原来的原件内容
            //如果 append = false，则不会追加，直接覆盖到原来的原件内容

            out = new BufferedWriter(new FileWriter("filename",true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("exception occoured"+ e);
        }

    }
}
