package com.lym.javademo.Java_Collection;

import java.util.*;

/**
 * List 截取
 * Created by lym on 2016/7/11.
 */
public class CollectionsIndexOfSubListLastIndexOfSubList {
    //如何使用 Collections 类的 indexOfSubList() 和 lastIndexOfSubList() 方法来查看子列表是否在列表中，并查看子列表在列表中所在的位置

    //INDEXOFSUBLIST_THRESHOLD  threshold 门槛

    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List : " + list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表 : " + sublist);

        //public static int indexOfSubList(List<?> source, List<?> target)
        System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, sublist));

        //public static int lastIndexOfSubList(List<?> source, List<?> target)
        System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));

        /*
        public static int indexOfSubList(List<?> source, List<?> target) {
            int sourceSize = source.size();
            int targetSize = target.size();
            int maxCandidate = sourceSize - targetSize;

            if (sourceSize < INDEXOFSUBLIST_THRESHOLD ||
                    (source instanceof RandomAccess &&target instanceof RandomAccess)) {
                nextCand:
                for (int candidate = 0; candidate <= maxCandidate; candidate++) {
                    for (int i=0, j=candidate; i<targetSize; i++, j++)
                        if (!eq(target.get(i), source.get(j)))
                            continue nextCand;  // Element mismatch, try next cand
                    return candidate;  // All elements of candidate matched target
                }
            } else {  // Iterator version of above algorithm
                ListIterator<?> si = source.listIterator();
                nextCand:
                for (int candidate = 0; candidate <= maxCandidate; candidate++) {
                    ListIterator<?> ti = target.listIterator();
                    for (int i=0; i<targetSize; i++) {
                        if (!eq(ti.next(), si.next())) {
                            // Back up source iterator to next candidate
                            for (int j=0; j<i; j++)
                                si.previous();
                            continue nextCand;
                        }
                    }
                    return candidate;
                }
            }
            return -1;  // No candidate matched the target
        }
            这里根据数据量的大小，采用了两种算法。
            数据量小时是一种算法，数据量大时，又是另一种算法。任何事情没有绝对，不同的方法，应用在不同的场景。
        */
    }
}
