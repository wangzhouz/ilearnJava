package chapter9;


import java.util.Scanner;

/*
 * 需求：
 * 定义一个方法，实现实符串反转。
 * 键盘录入一个字符串，调用该方法后，在控制台输出结果。
 * 例如：键盘录入abc，输出结果cba
 * */
public class StringTest4 {
    public static void main(String[] args) {
        strReversal();
    }

    public static void strReversal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        String text = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            text = text + str.charAt(i);
        }
        System.out.println(text);
    }
}
