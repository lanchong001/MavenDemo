package com.lym.javademo.Java_Date_Handler;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化时间（SimpleDateFormat）
 * 获取当前时间
 * 时间戳转换成时间
 * Created by lym on 2016/7/10.
 */
public class SimpleDataFormatEmp {
    //如何使用 SimpleDateFormat 类的 format(date) 方法来格式化时间

    public static void main(String[] args){

        //获取当前时间
        Date date = new Date();

        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));

        String strDateFormat1 = "yyyy-MM-dd HH:mm:ss a";  // a为am/pm的标记
        SimpleDateFormat sdf1 = new SimpleDateFormat();  // 格式化时间
        sdf1.applyPattern(strDateFormat1);   //设置时间格式
        System.out.println("现在时间：" + sdf1.format(date));  //输出已经格式化的现在时间（24小时制）

        //System.currentTimeMillis(); 获取系统时间，时间戳
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳

        System.out.println("System.currentTimeMillis : " + timeStamp);
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-MM-dd");

        // new Date(timeStamp) 时间戳转时间
        String sd = sdf2.format(new Date(timeStamp));
        //String sd = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
        System.out.println(sd);

        //date.getTime() 时间转时间戳
        System.out.println("当前时间，时间戳 : " + date.getTime());

    }
}
