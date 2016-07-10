package com.lym.javademo.Java_Directory_Operator;

import java.io.File;

/**
 *  判断文件是否隐藏
 *  使用 File 类的 file.isHidden() 方法来判断文件是否隐藏
 * Created by lym on 2016/7/9.
 */
public class FileIsHidden {
    public static void main(String[] args){
        File file = new File("G:\\study\\JAVA\\MavenDemo\\DemoMenu");
        System.out.print(file.isHidden());

        //file.isHidden()  判断当前文件或者文件夹是否已经设置了隐藏属性
    }
}
