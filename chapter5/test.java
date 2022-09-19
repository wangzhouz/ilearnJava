package chapter5;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        /*int[] arr = {8346};

        //把数组里的第一个数字拼接为一个int类型值。
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
            *//*运算逻辑：
            * number = 0*0 + 8 = 8;
            * number = 8*10 + 3 = 83;
            * number = 83*10 + 4 = 834;
            * number = 834*10 + 6 = 8346.
            * *//*
        }
        System.out.println(number);*/

//        numberToArr(12345);
        System.out.print(Arrays.toString(numberToArr(123456)));
    }

    public static int[] numberToArr(int number){
        //0、定义一个变量临时记录number，就是为了第三步的进修再次使用
        int temp = number;
        //1、计算出数组的长度
        int count = 0;
        while(number != 0){
            //每一次循环就去掉右边的一个数字
            number = number /10;
            //System.out.println(number);
            count++;
        }
        //2、动态初始化。
        int[] arr = new int[count];

        //3、把整数上的每一位都添加到数组当中。
        int index = arr.length -1;
        while(temp != 0){
            //
            int ge = temp % 10;
            temp = temp /10;
            arr[index] = ge;
            index--;
        }
        return arr;
    }
}


