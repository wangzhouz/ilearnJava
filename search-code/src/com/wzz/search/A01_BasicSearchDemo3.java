package com.wzz.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo3 {
    public static void main(String[] args) {
        /*
         * 需求：定义一个方法利用基本查找，查询某个元素在数组中的索引。
         * 要求：需要考虑数组中元素有重复的可能性。
         * 数据如下：{131,127,147,81,103,23,81,7,79}
         * */
        int[] arr = {131,127,147,81,103,23,81,7,79};
        System.out.println(indexSearchRep(arr, 1));

    }

    public static  ArrayList<Integer> indexSearchRep(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
               list.add(i);
            }
        }
        return list;
    }

}
