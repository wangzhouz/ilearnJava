package com.wzz.mycollection.a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class a04_TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        * 需求：利用TreeSet存储整数并进行排序
        * */

        //1、创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2、添加元素
        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        //3、打印集合
        System.out.println(ts);//[1, 2, 3, 4, 5]


        //4、遍历集合
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        //lambda表达式方式(内部类)
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        //lambda表达式方式
        ts.forEach(i -> System.out.println(i));


    }
}
