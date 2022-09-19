package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class forStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int start = sc.nextInt();
        System.out.println("请输入第二个整数");
        int end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //count +=1;
                count++;
                System.out.println(i);
            }
        }
        System.out.print("即能被3整除，又能被5整除数字有" + count + "多少个");
    }
}


