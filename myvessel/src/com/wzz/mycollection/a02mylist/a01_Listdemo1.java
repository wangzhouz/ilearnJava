package com.wzz.mycollection.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class a01_Listdemo1 {
    public static void main(String[] args) {
        //1、创件一个集哈
        List<String> list = new ArrayList<>();

        //2、添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //在指定的位置添加元素
        //细节：原来索引上的元素会依次往后移
        list.add(1, "QQQ");//[aaa, QQQ, bbb, ccc]

        //删除指定索引的元素，返回被删除元素
        String remove = list.remove(0);
        System.out.println(remove);
        //aaa
        //[QQQ, bbb, ccc]

        //修改指定索引处的元素，返回被修改的元素
        String result = list.set(0, "AAA");
        System.out.println(result);
        //QQQ
        //[AAA, bbb, ccc]

        //返回索引处的元素
        String s = list.get(0);
        System.out.println(s);//AAA

        //3、打印集合
//        System.out.println(list);
    }
}
