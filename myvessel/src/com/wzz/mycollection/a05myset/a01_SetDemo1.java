package com.wzz.mycollection.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class a01_SetDemo1 {
    public static void main(String[] args) {
        /*
        * 利用set系列的集哈，添加字符串，并使用多种方法遍历。
        *   迭代器
        *   增强for
        *   Lambda表达式
        * */

        //1、创件一个Set集合的对象
        Set<String> s = new HashSet<>();

        //2、添加无素
        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次添加，那么添加失败，返回flase
        boolean r1 = s.add("张三");
        boolean r2 = s.add("张三");
//        System.out.println(r1);//true
//        System.out.println(r2);//false
        s.add("李四");
        s.add("王五");


        //3、打印集合
        //无序：存和取是无序的
        System.out.println(s);//[李四, 张三, 王五]

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //增强for
        for (String str : s) {
            System.out.println(str);
        }

        //Lambda表达式(匿名内部类)
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        //Lambda表达式
        s.forEach(str -> System.out.println(str));

    }
}
