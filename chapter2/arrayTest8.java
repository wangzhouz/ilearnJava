package chapter2;

import java.util.Arrays;

/*
 *需求：定义一个数组，存入1,2,3,4,5.按照要求交换索引对应的元素。
 * 交换前：1,2,3,4,5,6
 * 交换后：6,5,4,3,2,1
 * */
public class arrayTest8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};//静态初始化数组

        int[] arr2 = new int[arr.length];//动态初始化数组

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            //System.out.println(arr[i]);
            j++;
            //System.out.print(j);
            arr2[j - 1] = arr[i];
        }
        arr = arr2;
        System.out.println(Arrays.toString(arr));
    }
}





