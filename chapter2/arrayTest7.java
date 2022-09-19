package chapter2;

import java.util.Arrays;
import java.util.Random;

/*
 * 需求：生成10个1~100之间的随机数存入数组。
 * 1、求出所有数据的和。
 * 2、求所有数据的平均数。
 * 3、统计有多少个数据比平均值小。
 * */
public class arrayTest7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        int sum = 0;
        int x = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];
        }
        System.out.println("数组为：" + Arrays.toString(arr) + "\n" +
                "数组中所有数字的和为：" + sum + "，平均数为：" + sum / arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sum / arr.length) {
                x++;
            }
        }
        System.out.println(x + "个数据比平均数" + sum / arr.length + "小");
    }
}



