package com.lym.javademo.Java_Environment_Setting;

/**
 * 如何编译 Java 文件
 * 如何执行编译过 Java 文件
 * 如何执行指定class文件目录（classpath）
 * 如何查看当前 Java 运行的版本?
 * Created by lym on 2016/7/9.
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
    }


}

/*
使用 javac 命令来编译 Java 文件，并使用 java 命令执行编译的文件
    c:\jdk\demoapp> javac HelloWorld.java
    c:\jdk\demoapp> java HelloWorld

如果我们 Java 编译后的class文件不在当前目录，我们可以使用 -classpath 来指定class文件目录
    c:> java -classpath C:\java\DemoClasses HelloWorld
如果class文件在jar文件中，则命令如下：
    c:> java -classpath C:\java\myclasses.jar

使用 -version 参数来查看当前 Java 的运行版本，命令如下：
    java -version

在终端Terminal窗口：

    cd G:\study\JAVA\MavenDemo\Example\src\com\lym\javademo\Java_Environment_Setting>

    javac -encoding UTF-8 HelloWorld.java //编译生成 HelloWorld.class文件

    直接执行 java HelloWorld 会报错

    报错解决办法：
    由于当前HelloWorld存在包名，所以，必须在当前目录创建 com\lym\javademo\Java_Environment_Setting 这些目录，
    并且把生成的HelloWorld.class 拷贝到刚刚创建的目录下，
    然后执行  com.lym.javademo.Java_Environment_Setting.HelloWorld 才能执行

    javac -encoding UTF-8 -d . HelloWorld.java  使用 javac -d . 即可在当前目录下创建包名对应的文件夹，并将HelloWorld.class生成在包名录下
    然后执行  com.lym.javademo.Java_Environment_Setting.HelloWorld


*/