package com.lym.javademo.Java_Collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 集合比较
 * Created by lym on 2016/7/10.
 */
public class CollectionsMinMax {
    //将字符串转换为集合并使用 Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set set = new TreeSet();

        //将字符串转换成set集合
        for (int i = 0; i < coins.length; i++)
            set.add(coins[i]);

        //Collections.min(set) 获取集合中最小的元素
        System.out.println(Collections.min(set));

        //Collections.min(set, String.CASE_INSENSITIVE_ORDER) 忽略大小写，获取集合中最小的元素
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
        for(int i=0;i<=10;i++)
            System.out.print("-");
        System.out.println("");

        //Collections.max(set) 获取集合中最大的元素
        System.out.println(Collections.max(set));
        //Collections.max(set, String.CASE_INSENSITIVE_ORDER) 忽略大小写，获取集合中最大的元素
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

        System.out.println("P,n,d,Q,d ascII : " + (int)'P' + " " +  (int) 'n' + " " +  (int) 'd'+ " " +  (int) 'q'+ " " +  (int) 'd');
        System.out.println("P,p ascII : " + (int)'P' + " " +  (int) 'p' );

        //字符串的大小比较实际是从第一个字符开始，比较字符的ASCII的大小，如果第一个相等，则比较第二个字符

    }
}
