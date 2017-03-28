package com.lym.designpatterns.behavioral.interpreter;

/**
 * Created by lym on 2017/3/28.
 */
public class InterpreterTest {

    public static void main(String[] args)
    {
        System.out.println("5 + 8 - 2 = ?");

        System.out.print("5 + 8 = ");
        System.out.println(new Add().calculation(new Context(5, 8)));

        System.out.print(String.format("%s - 2 = ",new Add().calculation(new Context(5, 8))));
        System.out.println(new Sub().calculation(new Context(new Add().calculation(new Context(5, 8)),2)));

    }

}
