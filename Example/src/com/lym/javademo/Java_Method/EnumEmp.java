package com.lym.javademo.Java_Method;

/**
 * Enum（枚举）构造函数及方法的使用
 * Created by lym on 2016/7/10.
 */
public class EnumEmp {

    public static void main(String args[]){
        System.out.println("所有汽车的价格：");
        for (Car c : Car.values())
            System.out.println(c + " 需要 " + c.getPrice() + " 千美元。");

        //Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类
        Car car = Car.tata;
        switch(car) {
            case lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 audi!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }
    }

    enum Car {
        lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
        private int price;
        Car(int p) {
            price = p;
        }
        int getPrice() {
            return price;
        }
    }
}
