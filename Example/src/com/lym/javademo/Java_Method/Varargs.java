package com.lym.javademo.Java_Method;

/**
 * Varargs 可变参数使用
 * 重载(overloading)方法中使用 Varargs
 * Java1.5提供了一个叫varargs的新功能，就是可变长度的参数。
 * "Varargs"是"variable number of arguments"的意思。有时候也被简单的称为"variable arguments"
 * 定义实参个数可变的方法：只要在一个形参的"类型"与"参数名"之间加上三个连续的"."（即"..."，英文里的句中省略号），就可以让它和不确定个实参相匹配。
 * Created by lym on 2016/7/10.
 */
public class Varargs {
    //int... intArrays 可变长度的参数
    static int sumvarargs(int... intArrays){
        int sum, i;
        sum=0;
        for(i=0; i< intArrays.length; i++) {
            sum += intArrays[i];
        }
        return(sum);
    }

    static void vaTest(int ... no) {
        System.out.print("vaTest(int ...): " + "参数个数: " + no.length +" 内容: ");
        for(int n : no)
            System.out.print(n + " ");
        System.out.println();
    }
    static void vaTest(boolean ... bl) {
        System.out.print("vaTest(boolean ...) " + "参数个数: " + bl.length + " 内容: ");
        for(boolean b : bl)
            System.out.print(b + " ");
        System.out.println();
    }
    static void vaTest(String msg, int ... no) {
        System.out.print("vaTest(String, int ...): " + msg +"参数个数: "+ no.length +" 内容: ");
        for(int  n : no)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int sum=0;
        sum = sumvarargs(new int[]{10,12,33});
        System.out.println("数字相加之和为: " + sum);

        vaTest(1, 2, 3);
        vaTest("测试: ", 10, 20);
        vaTest(true, false, false);
    }
}
