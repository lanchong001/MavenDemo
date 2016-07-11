package com.lym.javademo.Java_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 删除集合中指定元素
 * Created by lym on 2016/7/11.
 */
public class HashSetRemove {

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        System.out.println( "集合实例!\n" );
        HashSet collection = new HashSet ();
        collection.add("Yellow");
        collection.add("White");
        collection.add("Green");
        collection.add("Blue");

        System.out.print("集合数据: ");
        Iterator iter = collection.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        //public boolean remove(Object o)  直接删除HashSet中的元素对象
        collection.remove("White");  //删除某个HashSet对象的元素

        System.out.println("删除之后 [ White ]\n");
        System.out.print("现在集合的数据是: ");
        iter = collection.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        System.out.println("集合大小: " + collection.size() + "\n");

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Yellow");
        map.put(2, "White");
        map.put(3, "Green");
        map.put(4, "Blue");
        System.out.println("删除前的HashMap集合: " + map);

        //public V remove(Object key) 按照Key删除HashMap中的元素
        map.remove(2);  //删除HashMap中的某个元素

        System.out.println("删除后的HashMap集合: " + map);
        System.out.println("HashMap size: " + map.size());

        ArrayList<String> list = new ArrayList<String>();
        list.add("Yellow");
        list.add("White");
        list.add("Green");
        list.add("Blue");
        System.out.println("删除前的ArrayList集合: " + list);

        //public E remove(int index) 按照索引删除ArrayList中的元素
        list.remove(2);  //删除HashMap中的某个元素

        System.out.println("删除后的ArrayList集合: " + list);
        System.out.println("ArrayList size: " + list.size());
    }
}
