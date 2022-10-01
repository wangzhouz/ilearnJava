package com.wzz.mysort;

public class a04_RecursionDemo2 {
    public static void main(String[] args) {
        //需求：利用递归求1-100之间的和
        System.out.println(getSum(100));

    }


    public static int getSum(int number){
        //大问题拆解成小问题
        //1~100之间的和 = 100 +　（１~99之间的和）
        //1~99之间的和 = 99+　（１~98之间的和）
        //1~98之间的和 = 98 +　（１~97之间的和）
        //...
        //1~2之间的和 = 2 +　（１~1之间的和）
        //1~1之间的和 = 1 +　（递归出口）
        if (number == 1) {
            return 1;
        }

        return number + getSum(number -1);
    }

}
