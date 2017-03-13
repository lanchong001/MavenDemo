package com.lym.designpatterns.create.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lym on 2017/3/11.
 */
public class FactoryTest {

    public static void main(String[] args)
    {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("请输入数字A: ");
            String strA = strin.readLine();
            System.out.print("请选择运算符号(+、-、*、/): ");
            String opt = strin.readLine();
            System.out.print("请输入数字B: ");
            String strB = strin.readLine();

//            String strA = "2";
//            String opt = "-";
//            String strB = "3";

            Factory factory = new Factory();
            IOperator operator = factory.GetOperator(opt);
            int result = operator.getResult(Integer.parseInt(strA),Integer.parseInt(strB));
            System.out.println(result);

            IOperator operator1 = factory.GetMultiplyOperator();
            int result1 = operator1.getResult(Integer.parseInt(strA),Integer.parseInt(strB));
            System.out.println(result1);

            IOperator operator2 = Factory.GetStaticSubtractOperator();
            int result2 = operator2.getResult(Integer.parseInt(strA),Integer.parseInt(strB));
            System.out.println(result2);

            System.exit(0);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
