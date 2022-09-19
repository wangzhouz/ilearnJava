package chapter9;

import java.util.Scanner;

public class StringBuilderPractice3 {
    public static void main(String[] args) {
        romaToArab();
    }

    public static void romaToArab() {
        char[] romaNumber = {'Ⅰ', 'Ⅱ', 'Ⅲ', 'Ⅳ', 'Ⅴ', 'Ⅵ', 'Ⅶ', 'Ⅷ', 'Ⅸ' };

        //1、验证数字在0~999999999之间??????????
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("请输入数字···");
            number = sc.nextInt();
            if (number >= 0 && number <= 999999999) {
                System.out.println("输入的数值正确，开始处理···");
                break;
            } else {
                System.out.println("输入的数字无效");
            }
        }

        int remainder;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (number > 0) {
                remainder = number % 10;
                number = number / 10;
                sb.append(romaNumber[remainder - 1]);
            } else  {
                break;
            }
        }
        System.out.println(sb.reverse());
    }
}


