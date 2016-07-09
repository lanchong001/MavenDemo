package com.lym.javademo.Java_Array_Operator;

import java.util.ArrayList;

/**
 * 数组差集
 * Created by lym on 2016/7/9.
 */
public class ArrayListRemoveAll {
    //如何使用 removeAll () 方法来计算两个数组的差集
    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common2");
        objArray2.add(1,"common1");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 的元素" +objArray);
        System.out.println("array2 的元素" +objArray2);
        //从objArray集合中删除所有与objArray2集合相同的元素
        //注意:objArray2.add(0,"common2"); 表示在集合的0位置添加一个"common2"元素,不是由 1,"common1" 组成一个对象
        //删除集合objArray中与结合objArray2相同的元素
        objArray.removeAll(objArray2);
        //实际调用 batchRemove(c, false);
        //objArray.retainAll(objArray2) ----------  batchRemove(c, true)
        //objArray.removeAll(objArray2) ----------  batchRemove(c, false)

        System.out.println("array1 与 array2 数组差集为："+objArray);
    }
}
