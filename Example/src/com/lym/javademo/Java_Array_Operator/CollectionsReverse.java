package com.lym.javademo.Java_Array_Operator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 数组反转
 * Created by lym on 2016/7/9.
 */
public class CollectionsReverse {
    // 使用 Collections.reverse(ArrayList) 将数组进行反转
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序: " + arrayList);

        // Collections.reverse(list);  //实现了List接口的对象，都可以通过Collections.reverse()进行反转
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);
    }
}
