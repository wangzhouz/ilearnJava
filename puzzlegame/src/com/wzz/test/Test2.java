package com.wzz.test;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*//1、创建一个游戏主界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603, 680);
        gameJframe.setVisible(true);

        //2、创件一个登录界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488, 430);
        loginJframe.setVisible(true);

        //3、创建一个注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488, 500);
        registerJframe.setVisible(true);*/

        //1、定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2、打乱数组中的数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        //3、遍历数组
        System.out.println(Arrays.toString(tempArr));

        //4、创建一个二维数组
        int[][] data = new int[4][4];

        //5、给二维数组添加数据
        //解法2：
        //遍历二维数组，给里面的每一个数据赋值
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

        //遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ",");
            }
            System.out.println();
        }

    }
}
