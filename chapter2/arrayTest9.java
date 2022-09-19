package chapter2;

import java.util.Arrays;

/*
 *需求：定义一个数组，存入1,2,3,4,5.按照要求交换索引对应的元素。
 * 交换前：1,2,3,4,5,6
 * 交换后：6,5,4,3,2,1
 * */
public class arrayTest9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //交换变量i和变量j指向的元素;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}





