package com.wzz.test;

import java.util.Arrays;
import java.util.Random;

public class TTest {
    public static void main(String[] args) {
        char[] chr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        Random r = new Random();
        for (int i = 0; i < chr.length; i++) {
            int index = r.nextInt(chr.length);
//            System.out.println(index);
            char temp = chr[i];
            chr[i] = chr[index];
            chr[index] = temp;
        }
//        System.out.println(Arrays.toString(chr));

        //交换这两个变量的值
        int a = 1;
        int b = 3;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"\n"+b);


    }
}
