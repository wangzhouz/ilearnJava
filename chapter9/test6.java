package chapter9;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        /*//1、键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入相应的字符串");
        String str = sc.next();
        System.out.println(str.length());

        //2、进行遍历
        for (int i = 0; i < str.length(); i++) {
            System.out.println("索引" + i + "：" + str.charAt(i));
        }*/

        char x1 = 'a';
        String str = "abc";
        System.out.println(str.charAt(0));

        if(x1 == str.charAt(0)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        /*
        * a
        * true
        * */

    }
}


