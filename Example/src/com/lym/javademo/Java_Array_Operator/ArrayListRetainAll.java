package com.lym.javademo.Java_Array_Operator;

import java.util.ArrayList;

/**
 * 数组交集
 * Created by lym on 2016/7/9.
 */
public class ArrayListRetainAll {
    //如何使用 retainAll() 方法来获取与另外一个数组中的数组元素的交集：

    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 数组元素："+objArray);
        System.out.println("array2 数组元素："+objArray2);
        //删除集合objArray中与结合objArray2不相同的元素
        objArray.retainAll(objArray2);
        //实际调用 batchRemove(c, true);
        //objArray.retainAll(objArray2) ----------  batchRemove(c, true)
        //objArray.removeAll(objArray2) ----------  batchRemove(c, false)
        System.out.println("array2 & array1 数组交集为："+objArray);
    }
}
