package com.lym.javademo.Java_Collection;

import java.util.*;

/**
 * 只读集合
 * Created by lym on 2016/7/11.
 */
public class CollectionsUnmodifiableList {
    //使用 Collection 类的 Collections.unmodifiableList() 方法来设置集合为只读

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        List stuff = Arrays.asList("a", "b");
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);  //设置list集合不能修改
        try {
            list.set(0, "new value");
        }
        catch (UnsupportedOperationException e) {
            System.out.println("ArrayList Error: ");
            e.printStackTrace();
        }
        System.out.println("ArrayList : " + list);

        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);   //设置set集合不能修改
        try {
            set.add("c");
        }
        catch (UnsupportedOperationException e){
            System.out.println("HashSet Error: ");
            e.printStackTrace();
        }
        System.out.println("HashSet : " + set);

        Map map = new HashMap();
        map.put(1,"a");
        map.put(2,"b");
        map = Collections.unmodifiableMap(map);     //设置map集合不能修改
        try {
            map.put(1, "c");  //如果可修改的话，则会替换  1,"a" 的值
        }
        catch (UnsupportedOperationException e) {
            System.out.println("HashMap Error: ");
            e.printStackTrace();
        }
        System.out.println("HashMap : " + map);
    }
}
