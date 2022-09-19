package chapter9;


import java.util.Arrays;
import java.util.Scanner;

/*
 *需求：
 * 1、统计字符次数。
 * 2、键盘录入一个字符串，统计字符串中大写字母字符，小写字母字符，数字字符出现的次数。
 * */
public class StringTest {
    public static void main(String[] args) {
        /*String LowerCase = "abcdefghijklmnopqrstuvwxyz";
        String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Number = "0123456789";*/

        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;

        //1、键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");

        //输入的字符串str
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("小写字母："+ smallCount);
        System.out.println("大写字母："+ bigCount);
        System.out.println("数字："+ numberCount);
    }
}

