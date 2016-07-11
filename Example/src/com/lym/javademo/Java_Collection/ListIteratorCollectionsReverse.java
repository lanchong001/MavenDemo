package com.lym.javademo.Java_Collection;

import java.util.*;

/**
 * 集合反转
 * Created by lym on 2016/7/11.
 */
public class ListIteratorCollectionsReverse {
    //如何使用 Collection 和 Listiterator 类的 listIterator() 和 collection.reverse() 方法来反转集合中的元素

    /*
    Iterator 与 ListIterator 的相同点：都是迭代器
    Iterator 与 ListIterator 区别：
        1、ListIterator 实现了 Iterator 接口
        2、使用范围不同，Iterator可以应用于所有的集合，Set、List和Map和这些集合的子类型。而ListIterator只能用于List及其子类型。
        3、ListIterator有add方法，可以向List中添加对象，而Iterator不能
        4、ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator不可以
        5、ListIterator可以定位当前索引的位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能
        6、都可实现删除操作，但是ListIterator可以实现对象的修改，set()方法可以实现。Iterator仅能遍历，不能修改
    */

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        String[] coins = { "A", "B", "C", "D", "E" };

        //方案1:
        List l = new ArrayList();
        for (int i = 0; i < coins.length; i++)
            l.add(coins[i]);

        //Iterator<String> liter = l.iterator();
        //ListIterator liter = l.listIterator();
        ListIterator<String> liter = l.listIterator();
        System.out.println("反转前");
        while (liter.hasNext())
            System.out.println(liter.next());

        liter = l.listIterator();  //ListIterator 集合元素反转
        System.out.println("反转后");
        while (liter.hasNext())
            System.out.println(liter.next());

        //方案2:
        List<String> test = Arrays.asList(coins);
        System.out.println("反转前: " + test);
        Collections.reverse(test);  //list 集合元素反转
        System.out.println("反转后: " + test);
    }
}
