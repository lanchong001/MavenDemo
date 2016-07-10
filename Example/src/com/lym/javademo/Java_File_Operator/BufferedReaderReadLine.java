package com.lym.javademo.Java_File_Operator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文件内容
 * Created by lym on 2016/7/10.
 */
public class BufferedReaderReadLine {
    //使用 readLine() 方法来读取文件 outfilename 内容
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("outfilename"));
            String str;
            while((str = reader.readLine()) != null){
                System.out.println(str);
            }
            System.out.println(str);

            /*
                www.runoob.com
                null   注意：当已经到文件末尾时，reader.readLine() 返回的字符串将为null
            */
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
