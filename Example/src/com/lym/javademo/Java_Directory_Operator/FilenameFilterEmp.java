package com.lym.javademo.Java_Directory_Operator;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 在指定目录中查找文件
 * 演示了在 C 盘中查找以字母 'b' 开头的所有文件
 * Created by lym on 2016/7/9.
 */
public class FilenameFilterEmp {
    public static void main(String[] args){
        File dir = new File("C:");

        //此处是匿名类，
        // 直接通过new FilenameFilter,然后实现接口方法，而初始化一个FilenameFilter类型的对象
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("P");
            }
        };

        //dir.list(FilenameFilter filter) 获取符合filter条件的文件路径
        String[] children = dir.list(filter);
        if (children == null || children.length == 0) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }

    }
}
