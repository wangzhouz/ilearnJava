package com.wzz.mysort;

public class a04_RecursionDemo3 {
    public static void main(String[] args) {
        //需求：利用递归求5的阶乘
        System.out.println(getFactorialRecursion(5));//120
    }

    public static int getFactorialRecursion(int number) {
        //5!=5*4!;
        //4!=4*3!;
        //3!=3*2!;
        //2!=2*1!;
        //1!=1;
        if (number == 1) {
            return 1;
        }

        return number * getFactorialRecursion(number - 1);

    }

}
