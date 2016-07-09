package com.lym.javademo.Java_Array_Operator;

import java.util.*;

/**
 * 数组并集
 * Created by lym on 2016/7/9.
 */
public class ArrayListUnion {
    public static void main(String[] args) throws Exception {
        String[] arr1 = { "1", "2", "3","4" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("Array并集的结果如下：");

        for (String str : result_union) {
            System.out.println(str);
        }

        List list1 = Arrays.asList(arr1);
        List list2 = Arrays.asList(arr2);
        List list_union = union(list1,list2);
        System.out.println("List并集的结果如下：");

        System.out.println(list_union);
    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1, String[] arr2) {
        //利用HashSet将两个数组都存起来，HashSet会自动去除重复元素

        Set<String> set = new HashSet<String>();

        for (String str : arr1) {
            set.add(str);
        }

        for (String str : arr2) {
            set.add(str);
        }

        String[] result = {  };

        return set.toArray(result);
    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    public static List<String> union(List<String> list1, List<String> list2)  {
        Set<String> set = new HashSet<String>();

        for (String str : list1) {
            set.add(str);
        }

        for (String str : list2) {
            set.add(str);
        }

        String[] result = {  };

        return Arrays.asList(set.toArray(result));
    }
}
