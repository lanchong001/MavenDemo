package com.lym.javademo.Java_Array_Operator;

import java.util.Arrays;

/**
 * 判断数组是否相等
 * Created by lym on 2016/7/9.
 */
public class ArrayEquals {
    //如何使用 equals ()方法来判断数组是否相等
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};

        //Arrays.equals() 此方法有9个重载方法,针对8中基本类型的数组和Object数组
        //        public static boolean equals(long[] a, long[] a2)
        //        public static boolean equals(int[] a, int[] a2)
        //        public static boolean equals(short[] a, short a2[])
        //        public static boolean equals(char[] a, char[] a2)
        //        public static boolean equals(byte[] a, byte[] a2)
        //        public static boolean equals(boolean[] a, boolean[] a2)
        //        public static boolean equals(double[] a, double[] a2)
        //        public static boolean equals(float[] a, float[] a2)
        //        public static boolean equals(Object[] a, Object[] a2)

        System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary, ary1));
        System.out.println("数组 ary 是否与数组 ary2相等? ：" + Arrays.equals(ary, ary2));
    }
}
