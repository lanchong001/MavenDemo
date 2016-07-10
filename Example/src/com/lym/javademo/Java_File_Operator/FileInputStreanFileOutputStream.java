package com.lym.javademo.Java_File_Operator;

import java.io.*;

/**
 * 将文件内容复制到另一个文件
 * Created by lym on 2016/7/10.
 */
public class FileInputStreanFileOutputStream {
    //使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件
    public static void main(String[] args) throws Exception {

        //创建srcFile文件，并将内容 string to bo copied 写入文件
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcFile"));
        out1.write("string to bo copied\n");
        out1.close();

        //读出srcFile文件流
        InputStream in = new FileInputStream(new File("srcFile"));

        //创建targetFile文件，并将读出的文件流写入
        OutputStream out = new FileOutputStream(new File("targetFile"));

        //注意：还没有写入内容之前，将创建了targetFile文件，大小为0kb
        byte[] buf = new byte[1024];
        int len;
        while((len = in.read(buf)) > 0){
            out.write(buf,0,len);
        }
        in.close();
        out.close();

        //读出文件内容，打印
        BufferedReader in1 = new BufferedReader(new FileReader("targetFile"));
        String str;
        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in1.close();

    }
}
