package chapter9;

import java.util.Scanner;

public class StringBuilderTest4 {
    public static void main(String[] args) {
        //1、键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2、反转键盘录入的字符串
        /*StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);*/

        //2、链式编写
        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        //3、比较
        if(str.equals(result)){
            System.out.println("当前字符串是对称字符串");
        }else {
            System.out.println("当前字符串是非对称字符串");
        }
    }
}
