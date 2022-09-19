package chapter9;

import java.util.Scanner;

public class StringBuilderTest3 {
    public static void main(String[] args) {
        //链式编程：
        //当在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用其它方法。

        //1、通常调用方法，其方法返回值时，会定义一个变量去接收。
        //String str = getString();
        //System.out.println(str);

        //2、链式编程，可直接在方法后调用其它方法。
        //System.out.println(getString().substring(1).replace("c","q"));

        //3、也可以赋值给定义的变理
        int len= getString().substring(1).replace("c","q").length();
        System.out.println(len);

    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}





