package chapter2;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

/*
* 需求：定义一个数组，存入1~5.
* 要求打乱数组中的所有数据中的顺序。
* */
public class arrayTest10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
//            System.out.println(randomIndex);
            //拿着随机索引指向的元素跟i指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        System.out.println("打乱后的数组："+Arrays.toString(arr));
    }
}

