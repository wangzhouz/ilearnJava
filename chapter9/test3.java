package chapter9;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //1、键盘录入一个abc
        System.out.println("请输入字符串abc");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();//是new出来的。

        //2、代码中定义一个abc
        String s2 = "abc";

        //3、用==比较，这两者能一样码？
        System.out.println(s1 == s2);//false
    }
}



