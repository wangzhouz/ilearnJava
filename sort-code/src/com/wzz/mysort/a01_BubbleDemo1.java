package com.wzz.mysort;


public class a01_BubbleDemo1 {
    public static void main(String[] args) {
        /*冒泡排序
         * 核心思想：
         * 1、相邻的元素两两比较，大的放右边，小的放左边。
         * 2、第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
         * 3、如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
         * */

        //1、定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //2、利用冒泡排序将数组中的数据变成1 2 3 4 5。
        //第一轮：
        //结束之后，最大值在数组的最右边 ····5
        /*for (int i = 0; i < arr.length - 1; i++) {
            //相邻的元素两两比较,就是索引i与i+1比较
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArr(arr);

        //第二轮：
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            //相邻的元素两两比较,就是索引i与i+1比较
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArr(arr);

        //第三轮：
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            //相邻的元素两两比较,就是索引i与i+1比较
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArr(arr);

        //第四轮：
        for (int i = 0; i < arr.length - 1 - 3; i++) {
            //相邻的元素两两比较,就是索引i与i+1比较
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArr(arr);*/

        //外循环：表示要执行多少轮，如果有n个数据，那么执行n-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环：每一轮中如何比较数据并找到当前的最大值
            //-1：为了防止索引越界
            //-i：提高效率，每一轮执行的次数应该比上一轮少一次。
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);

    }

    private static void printArr(int[] arr) {
        //3、遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
