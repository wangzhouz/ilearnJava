package com.wzz.search;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        /*
        * 需求：定义一个方法利用基本查找，查询某个元素在数组中的索引。
        * 要求：不需要考虑数组中元素是否重复。
        * 数据如下：{131,127,147,81,103,23,7,79}
        * */
        int[] arr = {131,127,147,81,103,23,7,79};
        System.out.println(indexSearch(arr, 1));

    }

    public static int indexSearch(int[] arr, int number){
        for (int i = 0; i < number; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

}
