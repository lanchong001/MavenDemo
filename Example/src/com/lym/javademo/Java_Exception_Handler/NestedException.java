package com.lym.javademo.Java_Exception_Handler;

/**
 * 链试异常/异常嵌套
 * Created by lym on 2016/7/10.
 */
public class NestedException {
    //使用多个 catch 来处理链试异常
    public static void main (String args[]) throws Exception  {
        int n=20,result;
        try{
            result=n/0;
            System.out.println("结果为"+result);
        }
        catch(ArithmeticException ex){
            //异常catch处理中嵌套try catch

            System.out.println("发现算术异常: "+ex);
            try {
                throw new NumberFormatException();
            }
            catch(NumberFormatException ex1) {
                System.out.println("手动抛出链试异常 : "+ex1);
            }
        }
    }
}
