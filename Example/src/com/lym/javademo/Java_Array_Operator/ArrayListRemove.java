package com.lym.javademo.Java_Array_Operator;

import java.util.ArrayList;

/**
 * 删除数组元素
 * Created by lym on 2016/7/9.
 */
public class ArrayListRemove {
    //如何使用 remove () 方法来删除数组元素
    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        objArray.clear();  //清理objArray对象
        objArray.add(0,"第 0 个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove(1);  //删除索引为1的元素
        //在objArray中找不到"0th element"对象，所以，删除失败
        System.out.println(objArray.remove("0th element"));
        System.out.println("数组删除元素后："+objArray);
    }
}
