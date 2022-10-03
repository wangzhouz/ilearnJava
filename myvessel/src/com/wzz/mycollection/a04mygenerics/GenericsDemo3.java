package com.wzz.mycollection.a04mygenerics;

import java.util.ArrayList;

/*
* 定义一个工具类：ListUtil
* 类中定义一个静态方法addAll，用来添加多个集合的元素
* */
public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");

        System.out.println(list);

    }
}
