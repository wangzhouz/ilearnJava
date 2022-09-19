package chapter9;

import java.util.Scanner;

public class StringBuilderPractice33 {
    public static void main(String[] args) {
        romaToArab();
    }

    public static void romaToArab() {
        String[] romaNumber = {"''", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        //检查字符串：要求长度>=9,且只能是数字。
        boolean charCheck = true;
        while (charCheck) {
            if (str.length() <= 9) {
                //System.out.println(str+"字串长度为："+str.length()+"，符合长度要求");
                for (int i = 0; i < str.length(); i++) {
                    //判断输入的字符串是否只由数字组成。
                    //如果当前字符小于ASCII码表中的48（0）同时大于ASCII码表中的57（9），
                    //则设置charCheck为false,结束while循环。
                    if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                        charCheck = false;
                    } else {
                        i--;//如果不减1，for循环中的i还是会++，多次重试后，i将<str.length,程序报错。
                        System.out.println("含非数字的字符串,请重新输入");
                        str = sc.next();
                    }
                }
            } else {
                System.out.println(str + "字符串长度>=9,请重新输入");
                str = sc.next();
            }
        }

        StringBuilder sb = new StringBuilder();
        int[] strToInt = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            //char字符转int会将自己设置为ASCII码表中对应的“十进制”数值，具体如下：
            // 即：48,49,50,51,52,53,54,55,56,57
            strToInt[i] = str.charAt(i) - 48;
            sb.append(romaNumber[strToInt[i]]);
        }
        System.out.println(sb);
    }
}


