package chapter2;

import java.util.Arrays;

/*
* 定义一个数组，存储1,2,3,4,5,6,7,8,9,10遍历数组得到每一个元素。
* 要求：赋值
* 1、如要是奇数，则将当前数字扩大两倍。
* 2、如果是偶数，则将当前数字变成二分之一。
* */
public class arrayTest3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                arr[i] = arr[i]*2;
//                System.out.println(arr[i]+"为奇数,扩大两倍"+arr[i]*2);
            }else {
                arr[i] = arr[i]/2;
//                System.out.println(arr[i]+"为偶数,变成二分之一"+arr[i]/2);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


