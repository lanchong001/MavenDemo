package com.lym.javademo.Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合打乱顺序
 * Created by lym on 2016/7/11.
 */
public class CollectionsShuffle {
    //如何使用 Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println("打乱前： ");
        System.out.println(list);

        for(int i = 1; i< 6; i++){
            System.out.println("第" + i + "次打乱: ");
            Collections.shuffle(list);
            System.out.println(list);
        }

    }
}
