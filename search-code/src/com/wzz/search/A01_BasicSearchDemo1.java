package com.wzz.search;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找（顺序查找）
        //核心：从0索引开始按个往后查找
        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131,127,147,81,103,23,7,79}
        int[] arr = {131,127,147,81,103,23,7,79};
        System.out.println(basicSearch(arr,81));


    }

    public static boolean basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== number) {
                return true;
            }
        }
        return false;
    }

}
