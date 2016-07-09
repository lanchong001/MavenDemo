package com.lym.javademo.Java_Directory_Operator;

/**
 * 查看当前工作目录
 * 使用 System 的 getProperty() 方法来获取当前的工作目录
 * Created by lym on 2016/7/9.
 */
public class SystemGetProperty {
    public static void main(String[] args){
        String curDir = System.getProperty("user.dir");

        //System.getProperty("user.dir") 获取当前工作目录

        System.out.println("你当前的工作目录为:" + curDir);
    }
}
